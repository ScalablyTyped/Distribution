package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply bottom-right alignment for the selected table cells.
  */
trait ToggleTableCellAlignBottomRightCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignBottomRightCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAlignBottomRightCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignBottomRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignBottomRightCommand]
  }
}

