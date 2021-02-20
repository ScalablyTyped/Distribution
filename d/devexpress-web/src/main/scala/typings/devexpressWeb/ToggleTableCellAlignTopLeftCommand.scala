package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply top-left alignment for the selected table cells.
  */
@js.native
trait ToggleTableCellAlignTopLeftCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignTopLeftCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellAlignTopLeftCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignTopLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignTopLeftCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAlignTopLeftCommandMutableBuilder[Self <: ToggleTableCellAlignTopLeftCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
