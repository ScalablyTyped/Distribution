package typings
package devexpressDashWebLib

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
  def execute(columnCount: scala.Double, rowCount: scala.Double): scala.Boolean
}

object InsertTableCommand {
  @scala.inline
  def apply(
    execute: js.Function2[scala.Double, scala.Double, scala.Boolean],
    getState: js.Function0[SimpleCommandState]
  ): InsertTableCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[InsertTableCommand]
  }
}

