package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle all borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellAllBordersCommand")
@js.native
class ToggleTableCellAllBordersCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleTableCellAllBordersCommand {
  
  /**
    * Executes the ToggleTableCellAllBordersCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
