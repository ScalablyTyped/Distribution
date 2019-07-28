package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert table cells with a horizontal shift into the selected table.
  */
trait InsertTableCellWithShiftToTheLeftCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableCellWithShiftToTheLeftCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean
}

object InsertTableCellWithShiftToTheLeftCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableCellWithShiftToTheLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[InsertTableCellWithShiftToTheLeftCommand]
  }
}

