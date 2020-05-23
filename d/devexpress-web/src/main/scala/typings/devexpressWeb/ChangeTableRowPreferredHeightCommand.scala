package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's preferred row height.
  */
trait ChangeTableRowPreferredHeightCommand extends CommandBase {
  /**
    * Executes the ChangeTableRowPreferredHeightCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredHeight A TableHeightUnit object specifying preferred height of the selected table rows.
    */
  def execute(preferredHeight: TableHeightUnit): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableHeightUnit]
}

object ChangeTableRowPreferredHeightCommand {
  @scala.inline
  def apply(execute: TableHeightUnit => Boolean, getState: () => CommandState[TableHeightUnit]): ChangeTableRowPreferredHeightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableRowPreferredHeightCommand]
  }
}

