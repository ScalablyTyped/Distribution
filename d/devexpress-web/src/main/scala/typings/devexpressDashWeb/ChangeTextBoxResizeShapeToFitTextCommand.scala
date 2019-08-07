package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to resize the shape to fit the text in the text box.
  */
@JSGlobal("ChangeTextBoxResizeShapeToFitTextCommand")
@js.native
class ChangeTextBoxResizeShapeToFitTextCommand () extends CommandBase {
  /**
    * Executes the ChangeTextBoxResizeShapeToFitTextCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param resizeShapeToFitText true, to resize the shape to fit the text; otherwise, false.
    */
  def execute(resizeShapeToFitText: Boolean): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean] = js.native
}

