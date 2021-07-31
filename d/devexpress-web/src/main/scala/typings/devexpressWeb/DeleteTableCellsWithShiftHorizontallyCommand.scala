package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected table cells with a horizontal shift.
  */
trait DeleteTableCellsWithShiftHorizontallyCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteTableCellsWithShiftHorizontallyCommand command.
    */
  def execute(): Boolean
}
object DeleteTableCellsWithShiftHorizontallyCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableCellsWithShiftHorizontallyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableCellsWithShiftHorizontallyCommand]
  }
  
  @scala.inline
  implicit class DeleteTableCellsWithShiftHorizontallyCommandMutableBuilder[Self <: DeleteTableCellsWithShiftHorizontallyCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
