package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply bottom-left alignment for the selected table cells.
  */
@js.native
trait ToggleTableCellAlignBottomLeftCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignBottomLeftCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellAlignBottomLeftCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignBottomLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignBottomLeftCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAlignBottomLeftCommandMutableBuilder[Self <: ToggleTableCellAlignBottomLeftCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
