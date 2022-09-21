package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a column break at the current position in the document.
  */
@JSGlobal("InsertColumnBreakCommand")
@js.native
open class InsertColumnBreakCommand ()
  extends StObject
     with typings.devexpressWeb.InsertColumnBreakCommand {
  
  /**
    * Executes the InsertColumnBreakCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
