package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the preferred cell width of the selected table rows.
  */
trait ChangeTableCellPreferredWidthCommand extends CommandBase {
  /**
    * Executes the ChangeTableCellPreferredWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table rows.
    */
  def execute(preferredWidth: TableWidthUnit): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableWidthUnit]
}

object ChangeTableCellPreferredWidthCommand {
  @scala.inline
  def apply(execute: TableWidthUnit => Boolean, getState: () => CommandState[TableWidthUnit]): ChangeTableCellPreferredWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableCellPreferredWidthCommand]
  }
}

