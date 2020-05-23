package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle inner borders for selected cells on/off.
  */
trait ToggleTableCellInsideBordersCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellInsideBordersCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellInsideBordersCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellInsideBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellInsideBordersCommand]
  }
}

