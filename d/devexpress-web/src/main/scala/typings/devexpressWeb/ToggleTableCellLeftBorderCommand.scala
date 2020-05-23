package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle left borders for selected cells on/off.
  */
trait ToggleTableCellLeftBorderCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellLeftBorderCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellLeftBorderCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellLeftBorderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellLeftBorderCommand]
  }
}

