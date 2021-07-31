package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle right paragraph alignment on and off.
  */
@JSGlobal("ToggleParagraphAlignmentRightCommand")
@js.native
class ToggleParagraphAlignmentRightCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleParagraphAlignmentRightCommand {
  
  /**
    * Executes the ToggleParagraphAlignmentRightCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
