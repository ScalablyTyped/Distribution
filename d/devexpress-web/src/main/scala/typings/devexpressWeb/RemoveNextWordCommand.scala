package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the next word.
  */
trait RemoveNextWordCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveNextWordCommand command.
    */
  def execute(): Boolean
}
object RemoveNextWordCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveNextWordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveNextWordCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveNextWordCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
