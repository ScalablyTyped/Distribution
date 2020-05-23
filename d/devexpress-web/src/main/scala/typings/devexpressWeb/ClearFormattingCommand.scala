package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to reset the selected text's formatting to default.
  */
trait ClearFormattingCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ClearFormattingCommand command.
    */
  def execute(): Boolean
}

object ClearFormattingCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ClearFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ClearFormattingCommand]
  }
}

