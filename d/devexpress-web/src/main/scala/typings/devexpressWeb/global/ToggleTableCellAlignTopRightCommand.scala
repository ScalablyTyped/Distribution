package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply top-right alignment for the selected table cells.
  */
@JSGlobal("ToggleTableCellAlignTopRightCommand")
@js.native
open class ToggleTableCellAlignTopRightCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleTableCellAlignTopRightCommand {
  
  /**
    * Executes the ToggleTableCellAlignTopRightCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
