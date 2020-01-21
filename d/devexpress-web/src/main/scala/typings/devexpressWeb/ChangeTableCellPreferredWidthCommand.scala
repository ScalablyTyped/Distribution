package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the preferred cell width of the selected table rows.
  */
@JSGlobal("ChangeTableCellPreferredWidthCommand")
@js.native
class ChangeTableCellPreferredWidthCommand () extends CommandBase {
  /**
    * Executes the ChangeTableCellPreferredWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table rows.
    */
  def execute(preferredWidth: TableWidthUnit): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableWidthUnit] = js.native
}

