package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle all borders for selected cells on/off.
  */
trait ToggleTableCellAllBordersCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAllBordersCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAllBordersCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAllBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAllBordersCommand]
  }
}

