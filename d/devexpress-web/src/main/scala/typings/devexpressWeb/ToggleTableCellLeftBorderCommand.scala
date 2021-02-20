package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle left borders for selected cells on/off.
  */
@js.native
trait ToggleTableCellLeftBorderCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellLeftBorderCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellLeftBorderCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellLeftBorderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellLeftBorderCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellLeftBorderCommandMutableBuilder[Self <: ToggleTableCellLeftBorderCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
