package view

object InputView {

    private const val HEIGHT_STRING = "높이를 입력하세요."
    private const val WIDTH_STRING = "\n너비를 입력하세요."

    fun getHeight(): Int {
        println(HEIGHT_STRING)
        return readln().toInt()
    }

    fun getWidth(): Int {
        println(WIDTH_STRING)
        return readln().toInt()
    }
}
