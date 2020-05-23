package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply bottom-center alignment for the selected table cells.
  */
trait ToggleTableCellAlignBottomCenterCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignBottomCenterCommand command.
    */
  def execute(): Boolean
}

object ToggleTableCellAlignBottomCenterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignBottomCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignBottomCenterCommand]
  }
}

