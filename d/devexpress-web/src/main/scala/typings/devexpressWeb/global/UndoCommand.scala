package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to cancel changes caused by the previous command.
  */
@JSGlobal("UndoCommand")
@js.native
open class UndoCommand ()
  extends StObject
     with typings.devexpressWeb.UndoCommand {
  
  /**
    * Executes the UndoCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
