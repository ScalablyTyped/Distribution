package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to update the field's result.
  */
@js.native
trait UpdateFieldCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the UpdateFieldCommand command. true if the command has been successfully executed; false if the command execution has failed.
    * @param callback A callback function that is performed when updating of all fields in the selection is completed.
    */
  def execute(): Boolean = js.native
  def execute(callback: js.Function0[Unit]): Boolean = js.native
}
