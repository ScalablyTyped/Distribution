package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply middle-center alignment for the selected table cells.
  */
trait ToggleTableCellAlignMiddleCenterCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignMiddleCenterCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAlignMiddleCenterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignMiddleCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignMiddleCenterCommand]
  }
}

