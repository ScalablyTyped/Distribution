package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Cells dialog.
  */
trait InsertTableCellsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableCellsDialogCommand command.
    */
  def execute(): Boolean
}
object InsertTableCellsDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableCellsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableCellsDialogCommand]
  }
  
  @scala.inline
  implicit class InsertTableCellsDialogCommandMutableBuilder[Self <: InsertTableCellsDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
