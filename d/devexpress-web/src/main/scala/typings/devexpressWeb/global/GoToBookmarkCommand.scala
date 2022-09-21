package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets a command to navigate to the specified bookmark in the document.
  */
@JSGlobal("GoToBookmarkCommand")
@js.native
open class GoToBookmarkCommand ()
  extends StObject
     with typings.devexpressWeb.GoToBookmarkCommand {
  
  /**
    * Executes the GoToBookmarkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying the bookmark's name
    */
  /* CompleteClass */
  override def execute(name: String): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
