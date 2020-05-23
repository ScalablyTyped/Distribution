package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to create a table of equations.
  */
trait InsertTableOfEquationsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableOfEquationsCommand command.
    */
  def execute(): Boolean
}

object InsertTableOfEquationsCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfEquationsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfEquationsCommand]
  }
}

