package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's style options.
  */
@JSGlobal("ChangeTableLookCommand")
@js.native
class ChangeTableLookCommand () extends CommandBase {
  /**
    * Executes the ChangeTableLookCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableLookSettings object containing the settings that modify the table appearance.
    */
  def execute(settings: TableLookSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableLookSettings] = js.native
}

