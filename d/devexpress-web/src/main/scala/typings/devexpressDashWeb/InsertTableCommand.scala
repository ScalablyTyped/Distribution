package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Insert Table dialog.
  */
trait InsertTableCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param columnCount An integer value specifying a number of columns in a generated table.
    * @param rowCount An integer value specifying a number of rows in a generated table.
    */
  def execute(columnCount: Double, rowCount: Double): Boolean
}

object InsertTableCommand {
  @scala.inline
  def apply(execute: (Double, Double) => Boolean, getState: () => SimpleCommandState): InsertTableCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[InsertTableCommand]
  }
}

