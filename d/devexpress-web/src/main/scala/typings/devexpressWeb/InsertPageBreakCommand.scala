package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a page break at the current position in the document.
  */
trait InsertPageBreakCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertPageBreakCommand command.
    */
  def execute(): Boolean
}
object InsertPageBreakCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertPageBreakCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertPageBreakCommand]
  }
  
  extension [Self <: InsertPageBreakCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
