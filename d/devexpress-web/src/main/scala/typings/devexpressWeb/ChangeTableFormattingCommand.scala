package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's formatting.
  */
@JSGlobal("ChangeTableFormattingCommand")
@js.native
class ChangeTableFormattingCommand () extends js.Object {
  /**
    * Executes the ChangeTableFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object containing the settings to format a table.
    */
  def execute(settings: TableFormattingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableFormattingSettings] = js.native
}

