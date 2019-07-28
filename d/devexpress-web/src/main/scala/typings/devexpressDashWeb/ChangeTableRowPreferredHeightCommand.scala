package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's preferred row height.
  */
trait ChangeTableRowPreferredHeightCommand extends CommandBase {
  /**
    * Executes the ChangeTableRowPreferredHeightCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param preferredHeight A TableHeightUnit object specifying preferred height of the selected table rows.
    */
  def execute(preferredHeight: TableHeightUnit): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTableRowPreferredHeightCommand {
  @scala.inline
  def apply(execute: TableHeightUnit => Boolean, getState: () => js.Any): ChangeTableRowPreferredHeightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeTableRowPreferredHeightCommand]
  }
}

