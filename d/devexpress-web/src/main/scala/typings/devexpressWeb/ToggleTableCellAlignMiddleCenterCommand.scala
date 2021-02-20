package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply middle-center alignment for the selected table cells.
  */
@js.native
trait ToggleTableCellAlignMiddleCenterCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignMiddleCenterCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellAlignMiddleCenterCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignMiddleCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignMiddleCenterCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAlignMiddleCenterCommandMutableBuilder[Self <: ToggleTableCellAlignMiddleCenterCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
