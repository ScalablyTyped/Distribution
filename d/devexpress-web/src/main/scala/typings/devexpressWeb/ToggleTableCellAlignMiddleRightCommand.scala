package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply middle-right alignment for the selected table cells.
  */
trait ToggleTableCellAlignMiddleRightCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignMiddleRightCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAlignMiddleRightCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignMiddleRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignMiddleRightCommand]
  }
}

