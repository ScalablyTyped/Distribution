package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert an empty document field at the current position in the document.
  */
@js.native
trait CreateFieldCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the CreateFieldCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param code A string value specifying the field code receiving to the created field.
    */
  def execute(): Boolean = js.native
  def execute(code: String): Boolean = js.native
}
