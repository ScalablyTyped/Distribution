package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply middle-left alignment for the selected table cells.
  */
@JSGlobal("ToggleTableCellAlignMiddleLeftCommand")
@js.native
open class ToggleTableCellAlignMiddleLeftCommand ()
  extends StObject
     with typings.devexpressWeb.ToggleTableCellAlignMiddleLeftCommand {
  
  /**
    * Executes the ToggleTableCellAlignMiddleLeftCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
