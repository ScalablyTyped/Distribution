package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the background color of characters in a selected range.
  */
@js.native
trait ChangeFontBackColorCommand extends CommandBase {
  /**
    * Executes the ChangeFontBackColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying the background font color. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}

object ChangeFontBackColorCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => CommandState[String]): ChangeFontBackColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFontBackColorCommand]
  }
  @scala.inline
  implicit class ChangeFontBackColorCommandOps[Self <: ChangeFontBackColorCommand] (val x: Self) extends AnyVal {
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
    def setExecute(value: String => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    @scala.inline
    def setGetState(value: () => CommandState[String]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
  
}

