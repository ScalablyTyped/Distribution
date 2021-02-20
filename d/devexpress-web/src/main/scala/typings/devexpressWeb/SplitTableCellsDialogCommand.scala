package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Split Cells dialog.
  */
@js.native
trait SplitTableCellsDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the SplitTableCellsDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object SplitTableCellsDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): SplitTableCellsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SplitTableCellsDialogCommand]
  }
  
  @scala.inline
  implicit class SplitTableCellsDialogCommandMutableBuilder[Self <: SplitTableCellsDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
