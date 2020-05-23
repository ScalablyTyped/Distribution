package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to remove the next word.
  */
trait RemoveNextWordCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the RemoveNextWordCommand command.
    */
  def execute(): Boolean
}

object RemoveNextWordCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveNextWordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveNextWordCommand]
  }
}

