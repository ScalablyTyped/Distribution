package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply top-right alignment for the selected table cells.
  */
@js.native
trait ToggleTableCellAlignTopRightCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignTopRightCommand command.
    */
  def execute(): Boolean = js.native
}

object ToggleTableCellAlignTopRightCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignTopRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignTopRightCommand]
  }
  @scala.inline
  implicit class ToggleTableCellAlignTopRightCommandOps[Self <: ToggleTableCellAlignTopRightCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecute(value: () => Boolean): Self = this.set("execute", js.Any.fromFunction0(value))
  }
  
}

