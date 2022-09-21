package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle inner horizontal borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellInsideHorizontalBordersCommand")
@js.native
open class ToggleTableCellInsideHorizontalBordersCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleTableCellInsideHorizontalBordersCommand {
  
  /**
    * Executes the ToggleTableCellInsideHorizontalBordersCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
