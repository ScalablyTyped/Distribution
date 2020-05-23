package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to remove the borders of the selected table cells.
  */
trait RemoveTableCellBordersCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the RemoveTableCellBordersCommand command.
    */
  def execute(): Boolean
}

object RemoveTableCellBordersCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveTableCellBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveTableCellBordersCommand]
  }
}

