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

