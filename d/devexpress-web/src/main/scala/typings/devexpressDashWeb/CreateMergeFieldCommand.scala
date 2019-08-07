package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a MERGEFIELD field (with a data source column name) at the current position in the document.
  */
@JSGlobal("CreateMergeFieldCommand")
@js.native
class CreateMergeFieldCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the CreateMergeFieldCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fieldName A string value specifying the name of the merge field.
    */
  def execute(fieldName: String): Boolean = js.native
}

