package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply bottom-center alignment for the selected table cells.
  */
trait ToggleTableCellAlignBottomCenterCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignBottomCenterCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignBottomCenterCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignBottomCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignBottomCenterCommand]
  }
  
  extension [Self <: ToggleTableCellAlignBottomCenterCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
