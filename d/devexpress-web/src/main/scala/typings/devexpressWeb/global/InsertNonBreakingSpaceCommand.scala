package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add a non-breaking space in place of a selected range.
  */
@JSGlobal("InsertNonBreakingSpaceCommand")
@js.native
open class InsertNonBreakingSpaceCommand ()
  extends StObject
     with typings.devexpressWeb.InsertNonBreakingSpaceCommand {
  
  /**
    * Executes the InsertNonBreakingSpaceCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
