package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle right borders for selected cells on/off.
  */
trait ToggleTableCellRightBorderCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellRightBorderCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellRightBorderCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellRightBorderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellRightBorderCommand]
  }
}

