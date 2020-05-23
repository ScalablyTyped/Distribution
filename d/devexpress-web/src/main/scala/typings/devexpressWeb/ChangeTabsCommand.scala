package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change paragraph tab stops.
  */
trait ChangeTabsCommand extends js.Object {
  /**
    * Executes the ChangeTabsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TabsSettings object maintaining the information about tab stops.
    */
  def execute(settings: TabsSettings): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TabsSettings]
}

object ChangeTabsCommand {
  @scala.inline
  def apply(execute: TabsSettings => Boolean, getState: () => CommandState[TabsSettings]): ChangeTabsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTabsCommand]
  }
}

