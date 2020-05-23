package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle bottom borders for selected cells on/off.
  */
trait ToggleTableCellBottomBorderCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellBottomBorderCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellBottomBorderCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellBottomBorderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellBottomBorderCommand]
  }
}

