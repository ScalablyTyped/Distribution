package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply bottom-center alignment for the selected table cells.
  */
@js.native
trait ToggleTableCellAlignBottomCenterCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignBottomCenterCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellAlignBottomCenterCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellAlignBottomCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellAlignBottomCenterCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellAlignBottomCenterCommandMutableBuilder[Self <: ToggleTableCellAlignBottomCenterCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
