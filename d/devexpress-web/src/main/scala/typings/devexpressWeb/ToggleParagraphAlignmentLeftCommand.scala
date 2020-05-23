package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle left paragraph alignment on and off.
  */
trait ToggleParagraphAlignmentLeftCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleParagraphAlignmentLeftCommand command.
    */
  def execute(): Boolean
}

object ToggleParagraphAlignmentLeftCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentLeftCommand]
  }
}

