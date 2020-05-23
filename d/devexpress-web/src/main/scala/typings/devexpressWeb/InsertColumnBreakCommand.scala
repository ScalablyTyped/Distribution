package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a column break at the current position in the document.
  */
trait InsertColumnBreakCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertColumnBreakCommand command.
    */
  def execute(): Boolean
}

object InsertColumnBreakCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertColumnBreakCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertColumnBreakCommand]
  }
}

