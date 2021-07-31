package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply middle-left alignment for the selected table cells.
  */
trait ToggleTableCellAlignMiddleLeftCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignMiddleLeftCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignMiddleLeftCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignMiddleLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignMiddleLeftCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAlignMiddleLeftCommandMutableBuilder[Self <: ToggleTableCellAlignMiddleLeftCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
