package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to create a table of tables.
  */
trait InsertTableOfTablesCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableOfTablesCommand command.
    */
  def execute(): Boolean
}

object InsertTableOfTablesCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfTablesCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfTablesCommand]
  }
}

