package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the borders of the selected table cells.
  */
trait RemoveTableCellBordersCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveTableCellBordersCommand command.
    */
  def execute(): Boolean
}
object RemoveTableCellBordersCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveTableCellBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveTableCellBordersCommand]
  }
  
  extension [Self <: RemoveTableCellBordersCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
