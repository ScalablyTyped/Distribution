package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert the line break at the current position in the document.
  */
trait InsertLineBreakCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertLineBreakCommand command.
    */
  def execute(): Boolean
}

object InsertLineBreakCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertLineBreakCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertLineBreakCommand]
  }
}

