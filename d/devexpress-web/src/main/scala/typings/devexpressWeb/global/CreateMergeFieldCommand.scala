package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a MERGEFIELD field (with a data source column name) at the current position in the document.
  */
@JSGlobal("CreateMergeFieldCommand")
@js.native
class CreateMergeFieldCommand ()
  extends typings.devexpressWeb.CreateMergeFieldCommand {
  /**
    * Executes the CreateMergeFieldCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fieldName A string value specifying the name of the merge field.
    */
  /* CompleteClass */
  override def execute(fieldName: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

