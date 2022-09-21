package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the background color of the page.
  */
@JSGlobal("ChangePageColorCommand")
@js.native
open class ChangePageColorCommand ()
  extends StObject
     with typings.devexpressWeb.ChangePageColorCommand {
  
  /**
    * Executes the ChangePageColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying a background color of all pages contained in the document. May be specified as a color name or a hex color value.
    */
  /* CompleteClass */
  override def execute(color: String): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[String] = js.native
}
