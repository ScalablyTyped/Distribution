package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply top-left alignment for the selected table cells.
  */
@JSGlobal("ToggleTableCellAlignTopLeftCommand")
@js.native
open class ToggleTableCellAlignTopLeftCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleTableCellAlignTopLeftCommand {
  
  /**
    * Executes the ToggleTableCellAlignTopLeftCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
