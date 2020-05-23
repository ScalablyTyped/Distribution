package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to resize the shape to fit the text in the text box.
  */
trait ChangeTextBoxResizeShapeToFitTextCommand extends CommandBase {
  /**
    * Executes the ChangeTextBoxResizeShapeToFitTextCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param resizeShapeToFitText true, to resize the shape to fit the text; otherwise, false.
    */
  def execute(resizeShapeToFitText: Boolean): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}

object ChangeTextBoxResizeShapeToFitTextCommand {
  @scala.inline
  def apply(execute: Boolean => Boolean, getState: () => CommandState[Boolean]): ChangeTextBoxResizeShapeToFitTextCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTextBoxResizeShapeToFitTextCommand]
  }
}

