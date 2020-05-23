package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a row in a table below the selected row.
  */
trait InsertTableRowBelowCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableRowBelowCommand command.
    */
  def execute(): Boolean
}

object InsertTableRowBelowCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableRowBelowCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableRowBelowCommand]
  }
}

