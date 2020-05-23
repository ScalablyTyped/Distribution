package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the cell formatting of the selected table elements.
  */
trait ChangeTableCellFormattingCommand extends js.Object {
  /**
    * Executes the ChangeTableCellFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object specifying cell formatting of the selected table elements.
    */
  def execute(settings: TableCellFormattingSettings): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableCellFormattingSettings]
}

object ChangeTableCellFormattingCommand {
  @scala.inline
  def apply(
    execute: TableCellFormattingSettings => Boolean,
    getState: () => CommandState[TableCellFormattingSettings]
  ): ChangeTableCellFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableCellFormattingCommand]
  }
}

