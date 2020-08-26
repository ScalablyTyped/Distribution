package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change paragraph tab stops.
  */
@js.native
trait ChangeTabsCommand extends js.Object {
  /**
    * Executes the ChangeTabsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TabsSettings object maintaining the information about tab stops.
    */
  def execute(settings: TabsSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TabsSettings] = js.native
}

object ChangeTabsCommand {
  @scala.inline
  def apply(execute: TabsSettings => Boolean, getState: () => CommandState[TabsSettings]): ChangeTabsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTabsCommand]
  }
  @scala.inline
  implicit class ChangeTabsCommandOps[Self <: ChangeTabsCommand] (val x: Self) extends AnyVal {
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
    def setExecute(value: TabsSettings => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    @scala.inline
    def setGetState(value: () => CommandState[TabsSettings]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
  
}

