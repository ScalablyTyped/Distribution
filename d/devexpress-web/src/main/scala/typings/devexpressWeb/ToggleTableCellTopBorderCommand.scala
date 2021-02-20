package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle top borders for selected cells on/off.
  */
@js.native
trait ToggleTableCellTopBorderCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellTopBorderCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellTopBorderCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellTopBorderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellTopBorderCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellTopBorderCommandMutableBuilder[Self <: ToggleTableCellTopBorderCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
