package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
  */
@JSGlobal("ForceSyncWithServerCommand")
@js.native
class ForceSyncWithServerCommand ()
  extends StObject
     with typings.devexpressWeb.ForceSyncWithServerCommand {
  
  /**
    * Executes the ForceSyncWithServerCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param callback A callback function that is performed when the server model is updated.
    */
  /* CompleteClass */
  override def execute(callback: js.Function0[Unit]): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
