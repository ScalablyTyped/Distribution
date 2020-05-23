package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the repository item's table border style.
  */
trait ChangeTableBorderRepositoryItemCommand extends CommandBase {
  /**
    * Executes the ChangeTableBorderRepositoryItemCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object specifying the repository item's table border style.
    */
  def execute(settings: TableBorderSettings): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableBorderSettings]
}

object ChangeTableBorderRepositoryItemCommand {
  @scala.inline
  def apply(execute: TableBorderSettings => Boolean, getState: () => CommandState[TableBorderSettings]): ChangeTableBorderRepositoryItemCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableBorderRepositoryItemCommand]
  }
}

