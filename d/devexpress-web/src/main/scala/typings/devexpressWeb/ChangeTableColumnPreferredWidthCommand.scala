package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's preferred column width.
  */
@JSGlobal("ChangeTableColumnPreferredWidthCommand")
@js.native
class ChangeTableColumnPreferredWidthCommand () extends CommandBase {
  /**
    * Executes the ChangeTableColumnPreferredWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table columns.
    */
  def execute(preferredWidth: TableWidthUnit): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableWidthUnit] = js.native
}

