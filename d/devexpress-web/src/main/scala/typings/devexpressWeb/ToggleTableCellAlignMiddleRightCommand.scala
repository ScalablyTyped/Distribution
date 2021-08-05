package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply middle-right alignment for the selected table cells.
  */
trait ToggleTableCellAlignMiddleRightCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignMiddleRightCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignMiddleRightCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignMiddleRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignMiddleRightCommand]
  }
  
  extension [Self <: ToggleTableCellAlignMiddleRightCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
