package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change paragraph tab stops.
  */
trait ChangeTabsCommand extends CommandBase {
  /**
    * Executes the ChangeTabsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A TabsSettings object maintaining the information about tab stops.
    */
  def execute(settings: TabsSettings): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTabsCommand {
  @scala.inline
  def apply(execute: TabsSettings => Boolean, getState: () => js.Any): ChangeTabsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeTabsCommand]
  }
}

