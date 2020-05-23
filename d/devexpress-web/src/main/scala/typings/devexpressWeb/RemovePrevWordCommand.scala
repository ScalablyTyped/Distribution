package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to remove the previous word.
  */
trait RemovePrevWordCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the RemovePrevWordCommand command.
    */
  def execute(): Boolean
}

object RemovePrevWordCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemovePrevWordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemovePrevWordCommand]
  }
}

