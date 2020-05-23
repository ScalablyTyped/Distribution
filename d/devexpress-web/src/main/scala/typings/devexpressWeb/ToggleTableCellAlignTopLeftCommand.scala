package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply top-left alignment for the selected table cells.
  */
trait ToggleTableCellAlignTopLeftCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignTopLeftCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAlignTopLeftCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignTopLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignTopLeftCommand]
  }
}

