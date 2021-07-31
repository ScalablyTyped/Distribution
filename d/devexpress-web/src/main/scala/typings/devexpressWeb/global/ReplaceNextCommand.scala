package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to search for a specific text and replace the next match in the document with the specified string.
  */
@JSGlobal("ReplaceNextCommand")
@js.native
class ReplaceNextCommand ()
  extends StObject
     with typings.devexpressWeb.ReplaceNextCommand {
  
  /**
    * Executes the ReplaceNextCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param text A string value specifying a text to replace.
    * @param replaceText A string value specifying the inserted text.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    */
  /* CompleteClass */
  override def execute(text: String, replaceText: String, matchCase: Boolean): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
