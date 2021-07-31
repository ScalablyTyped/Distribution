package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply top-center alignment for the selected table cells.
  */
trait ToggleTableCellAlignTopCenterCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignTopCenterCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignTopCenterCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignTopCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignTopCenterCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAlignTopCenterCommandMutableBuilder[Self <: ToggleTableCellAlignTopCenterCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
