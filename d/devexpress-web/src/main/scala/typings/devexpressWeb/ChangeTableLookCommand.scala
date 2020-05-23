package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's style options.
  */
trait ChangeTableLookCommand extends CommandBase {
  /**
    * Executes the ChangeTableLookCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableLookSettings object containing the settings that modify the table appearance.
    */
  def execute(settings: TableLookSettings): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableLookSettings]
}

object ChangeTableLookCommand {
  @scala.inline
  def apply(execute: TableLookSettings => Boolean, getState: () => CommandState[TableLookSettings]): ChangeTableLookCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableLookCommand]
  }
}

