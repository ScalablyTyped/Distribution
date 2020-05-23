package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply top-center alignment for the selected table cells.
  */
trait ToggleTableCellAlignTopCenterCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignTopCenterCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAlignTopCenterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignTopCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignTopCenterCommand]
  }
}

