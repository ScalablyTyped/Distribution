package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the background color of characters in a selected range.
  */
@JSGlobal("ChangeFontBackColorCommand")
@js.native
class ChangeFontBackColorCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeFontBackColorCommand {
  
  /**
    * Executes the ChangeFontBackColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying the background font color. May be specified as a color name or a hex color value.
    */
  /* CompleteClass */
  override def execute(color: String): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[String] = js.native
}
