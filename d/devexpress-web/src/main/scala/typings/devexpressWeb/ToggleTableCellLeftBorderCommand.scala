package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle left borders for selected cells on/off.
  */
trait ToggleTableCellLeftBorderCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellLeftBorderCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellLeftBorderCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellLeftBorderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellLeftBorderCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToggleTableCellLeftBorderCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
