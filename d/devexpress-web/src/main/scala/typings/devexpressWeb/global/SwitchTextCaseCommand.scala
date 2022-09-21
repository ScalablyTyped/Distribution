package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to switch the text case at the current position in the document.
  */
@JSGlobal("SwitchTextCaseCommand")
@js.native
open class SwitchTextCaseCommand ()
  extends StObject
     with typings.devexpressWeb.SwitchTextCaseCommand {
  
  /**
    * Executes the SwitchTextCaseCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
