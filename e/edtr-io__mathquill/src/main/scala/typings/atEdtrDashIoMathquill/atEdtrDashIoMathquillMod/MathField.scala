package typings.atEdtrDashIoMathquill.atEdtrDashIoMathquillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathField extends js.Object {
  def blur(): MQ
  def clearSelection(): MQ
  def cmd(latex: String): MQ
  def config(config: Config): MQ
  def focus(): MQ
  def keystroke(keys: String): MQ
  def moveToDirEnd(direction: Double): MQ
  def moveToLeftEnd(): MQ
  def moveToRightEnd(): MQ
  def select(): MQ
  def typedText(text: String): MQ
  def write(latex: String): MQ
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
}

