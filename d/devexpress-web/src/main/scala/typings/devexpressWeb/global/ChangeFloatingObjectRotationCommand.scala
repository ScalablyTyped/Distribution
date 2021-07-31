package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to rotate a floating object.
  */
@JSGlobal("ChangeFloatingObjectRotationCommand")
@js.native
class ChangeFloatingObjectRotationCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeFloatingObjectRotationCommand {
  
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: Double): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Double] = js.native
}
