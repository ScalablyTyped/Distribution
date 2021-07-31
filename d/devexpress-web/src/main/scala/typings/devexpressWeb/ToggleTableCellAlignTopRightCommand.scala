package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply top-right alignment for the selected table cells.
  */
trait ToggleTableCellAlignTopRightCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignTopRightCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignTopRightCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignTopRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignTopRightCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAlignTopRightCommandMutableBuilder[Self <: ToggleTableCellAlignTopRightCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
