package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply top-right alignment for the selected table cells.
  */
trait ToggleTableCellAlignTopRightCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignTopRightCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAlignTopRightCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignTopRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignTopRightCommand]
  }
}

