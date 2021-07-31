package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle left paragraph alignment on and off.
  */
@JSGlobal("ToggleParagraphAlignmentLeftCommand")
@js.native
class ToggleParagraphAlignmentLeftCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleParagraphAlignmentLeftCommand {
  
  /**
    * Executes the ToggleParagraphAlignmentLeftCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
