package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a tab character at the current position in the document.
  */
trait InsertTabCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTabCommand command.
    */
  def execute(): Boolean
}
object InsertTabCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTabCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTabCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertTabCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
