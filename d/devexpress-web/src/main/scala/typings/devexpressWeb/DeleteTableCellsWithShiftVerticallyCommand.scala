package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected table cells with a vertical shift.
  */
trait DeleteTableCellsWithShiftVerticallyCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteTableCellsWithShiftVerticallyCommand command.
    */
  def execute(): Boolean
}
object DeleteTableCellsWithShiftVerticallyCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableCellsWithShiftVerticallyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableCellsWithShiftVerticallyCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTableCellsWithShiftVerticallyCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
