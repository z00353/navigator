import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Navigator extends JFrame {
    private JLabel  l;

    Navigator(String title) {
        super(title);

        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        GridLayout topGrid = new GridLayout();
        GridLayout bottomGrid = new GridLayout();
        GridLayout leftGrid = new GridLayout();
        GridLayout rightGrid = new GridLayout();
        GridLayout centreGrid = new GridLayout();

        l = new JLabel();

        // Top panel with button
        JPanel topPanel = new JPanel();
        topPanel.setBorder(LineBorder.createBlackLineBorder());
        topPanel.setLayout(topGrid);
        con.add(topPanel, BorderLayout.NORTH);
        JButton upButton = new JButton("Up");
        topPanel.add(upButton);

        // Bottom panel with button
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(LineBorder.createBlackLineBorder());
        bottomPanel.setLayout(bottomGrid);
        con.add(bottomPanel, BorderLayout.SOUTH);
        JButton downButton = new JButton("Down");
        bottomPanel.add(downButton);

        // Centre panel. NO button_________________________________
        JPanel centrePanel = new JPanel();
        centrePanel.setBorder(LineBorder.createBlackLineBorder());
        centrePanel.setLayout(centreGrid);// <<<
        con.add(centrePanel, BorderLayout.CENTER);
        centrePanel.add(l);// <<< The label in the middle
        l.setHorizontalAlignment(JLabel.CENTER);// Long live StackOverflow
        l.setForeground(Color.RED);

        // Left panel with button
        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(LineBorder.createBlackLineBorder());
        leftPanel.setLayout(leftGrid);
        con.add(leftPanel, BorderLayout.WEST);
        JButton leftButton = new JButton("Left");
        leftPanel.add(leftButton);

        // Right panel with button
        JPanel rightPanel = new JPanel();
        rightPanel.setBorder(LineBorder.createBlackLineBorder());
        rightPanel.setLayout(rightGrid);
        con.add(rightPanel, BorderLayout.EAST);
        JButton rightButton = new JButton("Right");
        rightPanel.add(rightButton);

        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Going Up");
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Going down");
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Going right");
            }
        });

        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Going left");
            }
        });

        pack();
        setSize(400,400);
        setLocation(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}