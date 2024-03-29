package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to reverse actions of the previous undo command.
  */
@JSGlobal("RedoCommand")
@js.native
open class RedoCommand ()
  extends StObject
     with typings.devexpressWeb.RedoCommand {
  
  /**
    * Executes the RedoCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
