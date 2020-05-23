package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle inner vertical borders for selected cells on/off.
  */
trait ToggleTableCellInsideVerticalBordersCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellInsideVerticalBordersCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellInsideVerticalBordersCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellInsideVerticalBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellInsideVerticalBordersCommand]
  }
}

