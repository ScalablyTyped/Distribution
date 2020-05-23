package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle outer borders for selected cells on/off.
  */
trait ToggleTableCellOutsideBordersCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellOutsideBordersCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellOutsideBordersCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellOutsideBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellOutsideBordersCommand]
  }
}

