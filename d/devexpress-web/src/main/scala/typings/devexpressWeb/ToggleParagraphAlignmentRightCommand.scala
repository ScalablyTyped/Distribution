package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle right paragraph alignment on and off.
  */
trait ToggleParagraphAlignmentRightCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleParagraphAlignmentRightCommand command.
    */
  def execute(): Boolean
}

object ToggleParagraphAlignmentRightCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentRightCommand]
  }
}

