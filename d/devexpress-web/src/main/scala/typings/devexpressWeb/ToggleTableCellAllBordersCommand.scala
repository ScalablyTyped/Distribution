package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle all borders for selected cells on/off.
  */
trait ToggleTableCellAllBordersCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAllBordersCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAllBordersCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAllBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAllBordersCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAllBordersCommandMutableBuilder[Self <: ToggleTableCellAllBordersCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
