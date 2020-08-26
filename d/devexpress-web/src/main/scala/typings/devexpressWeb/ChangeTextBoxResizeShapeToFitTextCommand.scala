package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to resize the shape to fit the text in the text box.
  */
@js.native
trait ChangeTextBoxResizeShapeToFitTextCommand extends CommandBase {
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

object ChangeTextBoxResizeShapeToFitTextCommand {
  @scala.inline
  def apply(execute: Boolean => Boolean, getState: () => CommandState[Boolean]): ChangeTextBoxResizeShapeToFitTextCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTextBoxResizeShapeToFitTextCommand]
  }
  @scala.inline
  implicit class ChangeTextBoxResizeShapeToFitTextCommandOps[Self <: ChangeTextBoxResizeShapeToFitTextCommand] (val x: Self) extends AnyVal {
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
    def setExecute(value: Boolean => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    @scala.inline
    def setGetState(value: () => CommandState[Boolean]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
  
}

