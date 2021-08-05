package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to create a table of equations.
  */
trait InsertTableOfEquationsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableOfEquationsCommand command.
    */
  def execute(): Boolean
}
object InsertTableOfEquationsCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfEquationsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfEquationsCommand]
  }
  
  extension [Self <: InsertTableOfEquationsCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
