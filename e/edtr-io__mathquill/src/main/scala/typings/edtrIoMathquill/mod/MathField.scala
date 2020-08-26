package typings.edtrIoMathquill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathField extends js.Object {
  def blur(): MQ = js.native
  def clearSelection(): MQ = js.native
  def cmd(latex: String): MQ = js.native
  def config(config: Config): MQ = js.native
  def focus(): MQ = js.native
  def keystroke(keys: String): MQ = js.native
  def moveToDirEnd(direction: Double): MQ = js.native
  def moveToLeftEnd(): MQ = js.native
  def moveToRightEnd(): MQ = js.native
  def select(): MQ = js.native
  def typedText(text: String): MQ = js.native
  def write(latex: String): MQ = js.native
}

object MathField {
  @scala.inline
  def apply(
    blur: () => MQ,
    clearSelection: () => MQ,
    cmd: String => MQ,
    config: Config => MQ,
    focus: () => MQ,
    keystroke: String => MQ,
    moveToDirEnd: Double => MQ,
    moveToLeftEnd: () => MQ,
    moveToRightEnd: () => MQ,
    select: () => MQ,
    typedText: String => MQ,
    write: String => MQ
  ): MathField = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), clearSelection = js.Any.fromFunction0(clearSelection), cmd = js.Any.fromFunction1(cmd), config = js.Any.fromFunction1(config), focus = js.Any.fromFunction0(focus), keystroke = js.Any.fromFunction1(keystroke), moveToDirEnd = js.Any.fromFunction1(moveToDirEnd), moveToLeftEnd = js.Any.fromFunction0(moveToLeftEnd), moveToRightEnd = js.Any.fromFunction0(moveToRightEnd), select = js.Any.fromFunction0(select), typedText = js.Any.fromFunction1(typedText), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[MathField]
  }
  @scala.inline
  implicit class MathFieldOps[Self <: MathField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlur(value: () => MQ): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def setClearSelection(value: () => MQ): Self = this.set("clearSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setCmd(value: String => MQ): Self = this.set("cmd", js.Any.fromFunction1(value))
    @scala.inline
    def setConfig(value: Config => MQ): Self = this.set("config", js.Any.fromFunction1(value))
    @scala.inline
    def setFocus(value: () => MQ): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setKeystroke(value: String => MQ): Self = this.set("keystroke", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveToDirEnd(value: Double => MQ): Self = this.set("moveToDirEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveToLeftEnd(value: () => MQ): Self = this.set("moveToLeftEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveToRightEnd(value: () => MQ): Self = this.set("moveToRightEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setSelect(value: () => MQ): Self = this.set("select", js.Any.fromFunction0(value))
    @scala.inline
    def setTypedText(value: String => MQ): Self = this.set("typedText", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: String => MQ): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

