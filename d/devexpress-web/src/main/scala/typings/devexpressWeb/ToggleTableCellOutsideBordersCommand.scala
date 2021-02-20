package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle outer borders for selected cells on/off.
  */
@js.native
trait ToggleTableCellOutsideBordersCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellOutsideBordersCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellOutsideBordersCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellOutsideBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellOutsideBordersCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellOutsideBordersCommandMutableBuilder[Self <: ToggleTableCellOutsideBordersCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
