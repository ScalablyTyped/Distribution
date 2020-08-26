package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the bulleted paragraph and normal text.
  */
@js.native
trait ToggleBulletedListCommand extends CommandBase {
  /**
    * Executes the ToggleBulletedListCommand command.
    */
  def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean] = js.native
}

object ToggleBulletedListCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleBulletedListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleBulletedListCommand]
  }
  @scala.inline
  implicit class ToggleBulletedListCommandOps[Self <: ToggleBulletedListCommand] (val x: Self) extends AnyVal {
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
    def setExecute(value: () => Boolean): Self = this.set("execute", js.Any.fromFunction0(value))
    @scala.inline
    def setGetState(value: () => CommandState[Boolean]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
  
}

