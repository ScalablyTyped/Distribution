package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a table column to the left of the current position in the table.
  */
trait InsertTableColumnToTheLeftCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableColumnToTheLeftCommand command.
    */
  def execute(): Boolean
}

object InsertTableColumnToTheLeftCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableColumnToTheLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableColumnToTheLeftCommand]
  }
}

