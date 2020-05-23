package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to format a current paragraph with one and a half line spacing.
  */
trait SetSesquialteralParagraphSpacingCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the SetSesquialteralParagraphSpacingCommand command.
    */
  def execute(): Boolean
}

object SetSesquialteralParagraphSpacingCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): SetSesquialteralParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetSesquialteralParagraphSpacingCommand]
  }
}

