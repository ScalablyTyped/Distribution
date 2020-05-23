package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle centered paragraph alignment on and off.
  */
trait ToggleParagraphAlignmentCenterCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleParagraphAlignmentCenterCommand command.
    */
  def execute(): Boolean
}

object ToggleParagraphAlignmentCenterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentCenterCommand]
  }
}

