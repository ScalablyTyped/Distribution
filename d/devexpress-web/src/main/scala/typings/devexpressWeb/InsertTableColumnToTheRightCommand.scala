package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a table column to the right of the current position in the table.
  */
trait InsertTableColumnToTheRightCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableColumnToTheRightCommand command.
    */
  def execute(): Boolean
}

object InsertTableColumnToTheRightCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableColumnToTheRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableColumnToTheRightCommand]
  }
}

