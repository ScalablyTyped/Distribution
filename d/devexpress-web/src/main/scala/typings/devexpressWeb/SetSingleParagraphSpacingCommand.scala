package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to format a current paragraph with single line spacing.
  */
trait SetSingleParagraphSpacingCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the SetSingleParagraphSpacingCommand command.
    */
  def execute(): Boolean
}

object SetSingleParagraphSpacingCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): SetSingleParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetSingleParagraphSpacingCommand]
  }
}

