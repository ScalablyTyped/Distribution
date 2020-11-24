package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to update all fields in the selected range.
  */
@js.native
trait UpdateAllFieldsCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the UpdateAllFieldsCommand command. true if the command has been successfully executed; false if the command execution has failed.
    * @param callback A callback function that is performed when updating of all fields in the document is completed.
    */
  def execute(): Boolean = js.native
  def execute(callback: js.Function0[Unit]): Boolean = js.native
}
