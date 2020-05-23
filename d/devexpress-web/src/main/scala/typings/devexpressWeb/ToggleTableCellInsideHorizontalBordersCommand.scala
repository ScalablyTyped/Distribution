package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle inner horizontal borders for selected cells on/off.
  */
trait ToggleTableCellInsideHorizontalBordersCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellInsideHorizontalBordersCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellInsideHorizontalBordersCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellInsideHorizontalBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellInsideHorizontalBordersCommand]
  }
}

