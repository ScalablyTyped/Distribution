package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to reverse actions of the previous undo command.
  */
trait RedoCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the RedoCommand command.
    */
  def execute(): Boolean
}

object RedoCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RedoCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RedoCommand]
  }
}

