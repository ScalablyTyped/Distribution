package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle inner horizontal borders for selected cells on/off.
  */
trait ToggleTableCellInsideHorizontalBordersCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellInsideHorizontalBordersCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellInsideHorizontalBordersCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellInsideHorizontalBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellInsideHorizontalBordersCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToggleTableCellInsideHorizontalBordersCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
