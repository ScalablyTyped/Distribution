package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's preferred row height.
  */
@JSGlobal("ChangeTableRowPreferredHeightCommand")
@js.native
class ChangeTableRowPreferredHeightCommand () extends CommandBase {
  /**
    * Executes the ChangeTableRowPreferredHeightCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredHeight A TableHeightUnit object specifying preferred height of the selected table rows.
    */
  def execute(preferredHeight: TableHeightUnit): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableHeightUnit] = js.native
}

