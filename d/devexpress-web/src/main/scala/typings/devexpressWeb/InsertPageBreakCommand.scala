package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a page break at the current position in the document.
  */
trait InsertPageBreakCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertPageBreakCommand command.
    */
  def execute(): Boolean
}

object InsertPageBreakCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertPageBreakCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertPageBreakCommand]
  }
}

