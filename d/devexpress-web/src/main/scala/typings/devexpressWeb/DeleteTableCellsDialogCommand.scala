package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Delete Cells dialog.
  */
trait DeleteTableCellsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteTableCellsDialogCommand command.
    */
  def execute(): Boolean
}
object DeleteTableCellsDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableCellsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableCellsDialogCommand]
  }
  
  @scala.inline
  implicit class DeleteTableCellsDialogCommandMutableBuilder[Self <: DeleteTableCellsDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
