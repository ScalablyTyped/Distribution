package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply bottom-left alignment for the selected table cells.
  */
trait ToggleTableCellAlignBottomLeftCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignBottomLeftCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignBottomLeftCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignBottomLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignBottomLeftCommand]
  }
  
  extension [Self <: ToggleTableCellAlignBottomLeftCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
