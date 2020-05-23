package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete the selected table rows.
  */
trait DeleteTableRowsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteTableRowsCommand command.
    */
  def execute(): Boolean
}

object DeleteTableRowsCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableRowsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableRowsCommand]
  }
}

