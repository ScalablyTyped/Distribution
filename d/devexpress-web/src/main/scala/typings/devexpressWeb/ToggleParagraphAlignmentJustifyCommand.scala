package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle justified paragraph alignment on and off.
  */
trait ToggleParagraphAlignmentJustifyCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleParagraphAlignmentJustifyCommand command.
    */
  def execute(): Boolean
}

object ToggleParagraphAlignmentJustifyCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentJustifyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentJustifyCommand]
  }
}

