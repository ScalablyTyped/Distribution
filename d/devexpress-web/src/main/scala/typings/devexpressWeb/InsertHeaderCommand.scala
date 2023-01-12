package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to activate the page header and begin editing.
  */
trait InsertHeaderCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertHeaderCommand command.
    */
  def execute(): Boolean
}
object InsertHeaderCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertHeaderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertHeaderCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertHeaderCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
