package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to format a current paragraph with double line spacing.
  */
trait SetDoubleParagraphSpacingCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the SetDoubleParagraphSpacingCommand command.
    */
  def execute(): Boolean
}

object SetDoubleParagraphSpacingCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): SetDoubleParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetDoubleParagraphSpacingCommand]
  }
}

