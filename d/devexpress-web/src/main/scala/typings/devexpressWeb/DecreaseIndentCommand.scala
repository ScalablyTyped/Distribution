package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to decrement the indent level of paragraphs in a selected range.
  */
trait DecreaseIndentCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DecreaseIndentCommand command.
    */
  def execute(): Boolean
}

object DecreaseIndentCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecreaseIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DecreaseIndentCommand]
  }
}

