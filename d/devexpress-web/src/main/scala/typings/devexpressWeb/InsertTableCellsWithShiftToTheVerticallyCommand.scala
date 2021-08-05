package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert table cells with a vertical shift into the selected table.
  */
trait InsertTableCellsWithShiftToTheVerticallyCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableCellsWithShiftToTheVerticallyCommand command.
    */
  def execute(): Boolean
}
object InsertTableCellsWithShiftToTheVerticallyCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableCellsWithShiftToTheVerticallyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableCellsWithShiftToTheVerticallyCommand]
  }
  
  extension [Self <: InsertTableCellsWithShiftToTheVerticallyCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
