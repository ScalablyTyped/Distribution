package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle inner horizontal borders for selected cells on/off.
  */
@js.native
trait ToggleTableCellInsideHorizontalBordersCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellInsideHorizontalBordersCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellInsideHorizontalBordersCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellInsideHorizontalBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellInsideHorizontalBordersCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellInsideHorizontalBordersCommandMutableBuilder[Self <: ToggleTableCellInsideHorizontalBordersCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
