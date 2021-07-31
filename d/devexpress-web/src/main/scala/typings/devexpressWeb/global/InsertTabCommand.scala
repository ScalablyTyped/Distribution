package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a tab character at the current position in the document.
  */
@JSGlobal("InsertTabCommand")
@js.native
class InsertTabCommand ()
  extends StObject
     with typings.devexpressWeb.InsertTabCommand {
  
  /**
    * Executes the InsertTabCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
