package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the page orientation.
  */
@JSGlobal("ChangePageOrientationCommand")
@js.native
open class ChangePageOrientationCommand ()
  extends StObject
     with typings.devexpressWeb.ChangePageOrientationCommand {
  
  /**
    * Executes the ChangePageOrientationCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param orientation The page orientation.
    */
  /* CompleteClass */
  override def execute(orientation: typings.devexpressWeb.Orientation): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.Orientation] = js.native
}
