package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to decrement the indent level of paragraphs in a selected numbered list.
  */
trait DecrementNumberingIndentCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DecrementNumberingIndentCommand command.
    */
  def execute(): Boolean
}

object DecrementNumberingIndentCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecrementNumberingIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DecrementNumberingIndentCommand]
  }
}

