package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply bottom-left alignment for the selected table cells.
  */
trait ToggleTableCellAlignBottomLeftCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignBottomLeftCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAlignBottomLeftCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignBottomLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignBottomLeftCommand]
  }
}

