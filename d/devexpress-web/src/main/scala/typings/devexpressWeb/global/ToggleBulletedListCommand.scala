package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the bulleted paragraph and normal text.
  */
@JSGlobal("ToggleBulletedListCommand")
@js.native
open class ToggleBulletedListCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleBulletedListCommand {
  
  /**
    * Executes the ToggleBulletedListCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
