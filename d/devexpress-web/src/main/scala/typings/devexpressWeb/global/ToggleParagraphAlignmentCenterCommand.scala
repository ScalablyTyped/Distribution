package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle centered paragraph alignment on and off.
  */
@JSGlobal("ToggleParagraphAlignmentCenterCommand")
@js.native
open class ToggleParagraphAlignmentCenterCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleParagraphAlignmentCenterCommand {
  
  /**
    * Executes the ToggleParagraphAlignmentCenterCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
