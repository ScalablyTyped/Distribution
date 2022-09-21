package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle left borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellLeftBorderCommand")
@js.native
open class ToggleTableCellLeftBorderCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleTableCellLeftBorderCommand {
  
  /**
    * Executes the ToggleTableCellLeftBorderCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
