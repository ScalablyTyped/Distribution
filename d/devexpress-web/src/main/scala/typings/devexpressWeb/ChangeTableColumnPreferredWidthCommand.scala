package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's preferred column width.
  */
trait ChangeTableColumnPreferredWidthCommand extends CommandBase {
  /**
    * Executes the ChangeTableColumnPreferredWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table columns.
    */
  def execute(preferredWidth: TableWidthUnit): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableWidthUnit]
}

object ChangeTableColumnPreferredWidthCommand {
  @scala.inline
  def apply(execute: TableWidthUnit => Boolean, getState: () => CommandState[TableWidthUnit]): ChangeTableColumnPreferredWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableColumnPreferredWidthCommand]
  }
}

