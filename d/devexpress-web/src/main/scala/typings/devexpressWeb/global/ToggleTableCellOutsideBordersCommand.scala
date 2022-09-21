package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle outer borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellOutsideBordersCommand")
@js.native
open class ToggleTableCellOutsideBordersCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleTableCellOutsideBordersCommand {
  
  /**
    * Executes the ToggleTableCellOutsideBordersCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
