package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a row in a table below the selected row.
  */
trait InsertTableRowBelowCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableRowBelowCommand command.
    */
  def execute(): Boolean
}
object InsertTableRowBelowCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableRowBelowCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableRowBelowCommand]
  }
  
  extension [Self <: InsertTableRowBelowCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
