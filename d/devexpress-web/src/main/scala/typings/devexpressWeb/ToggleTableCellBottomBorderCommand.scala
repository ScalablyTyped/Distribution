package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle bottom borders for selected cells on/off.
  */
@js.native
trait ToggleTableCellBottomBorderCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellBottomBorderCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellBottomBorderCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellBottomBorderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellBottomBorderCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellBottomBorderCommandMutableBuilder[Self <: ToggleTableCellBottomBorderCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
