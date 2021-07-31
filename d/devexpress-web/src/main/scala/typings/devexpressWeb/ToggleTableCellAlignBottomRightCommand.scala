package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply bottom-right alignment for the selected table cells.
  */
trait ToggleTableCellAlignBottomRightCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignBottomRightCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignBottomRightCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignBottomRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignBottomRightCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAlignBottomRightCommandMutableBuilder[Self <: ToggleTableCellAlignBottomRightCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
