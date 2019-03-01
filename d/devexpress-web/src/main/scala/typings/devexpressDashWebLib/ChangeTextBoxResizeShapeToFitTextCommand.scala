package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to resize the shape to fit the text in the text box.
  */
trait ChangeTextBoxResizeShapeToFitTextCommand extends CommandBase {
  /**
    * Executes the ChangeTextBoxResizeShapeToFitTextCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param resizeShapeToFitText true, to resize the shape to fit the text; otherwise, false.
    */
  def execute(resizeShapeToFitText: scala.Boolean): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTextBoxResizeShapeToFitTextCommand {
  @scala.inline
  def apply(execute: js.Function1[scala.Boolean, scala.Boolean], getState: js.Function0[js.Any]): ChangeTextBoxResizeShapeToFitTextCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeTextBoxResizeShapeToFitTextCommand]
  }
}

