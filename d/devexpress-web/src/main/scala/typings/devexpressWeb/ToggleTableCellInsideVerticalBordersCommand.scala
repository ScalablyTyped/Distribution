package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle inner vertical borders for selected cells on/off.
  */
trait ToggleTableCellInsideVerticalBordersCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellInsideVerticalBordersCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellInsideVerticalBordersCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellInsideVerticalBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellInsideVerticalBordersCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellInsideVerticalBordersCommandMutableBuilder[Self <: ToggleTableCellInsideVerticalBordersCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
