package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle top borders for selected cells on/off.
  */
trait ToggleTableCellTopBorderCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellTopBorderCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellTopBorderCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellTopBorderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellTopBorderCommand]
  }
}

