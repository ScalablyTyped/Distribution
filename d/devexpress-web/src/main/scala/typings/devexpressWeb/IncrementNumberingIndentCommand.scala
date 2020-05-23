package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to increment the indent level of paragraphs in a selected numbered list.
  */
trait IncrementNumberingIndentCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the IncrementNumberingIndentCommand command.
    */
  def execute(): Boolean
}

object IncrementNumberingIndentCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncrementNumberingIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncrementNumberingIndentCommand]
  }
}

