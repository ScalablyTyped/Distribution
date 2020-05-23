package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the multilevel list style and normal text.
  */
trait ToggleMultilevelListCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleMultilevelListCommand command.
    */
  def execute(): Boolean
}

object ToggleMultilevelListCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleMultilevelListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleMultilevelListCommand]
  }
}

