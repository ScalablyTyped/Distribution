package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to cut the selected text and place it to the clipboard.
  */
@JSGlobal("CutCommand")
@js.native
class CutCommand ()
  extends StObject
     with typings.devexpressWeb.CutCommand {
  
  /**
    * Executes the CutCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
