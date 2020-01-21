package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the cell formatting of the selected table elements.
  */
@JSGlobal("ChangeTableCellFormattingCommand")
@js.native
class ChangeTableCellFormattingCommand () extends js.Object {
  /**
    * Executes the ChangeTableCellFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object specifying cell formatting of the selected table elements.
    */
  def execute(settings: TableCellFormattingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableCellFormattingSettings] = js.native
}

