package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Insert Table dialog.
  */
@JSGlobal("InsertTableCommand")
@js.native
class InsertTableCommand ()
  extends typings.devexpressWeb.InsertTableCommand {
  /**
    * Executes the InsertTableCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An integer value specifying a number of columns in a generated table.
    * @param rowCount An integer value specifying a number of rows in a generated table.
    */
  /* CompleteClass */
  override def execute(columnCount: Double, rowCount: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

