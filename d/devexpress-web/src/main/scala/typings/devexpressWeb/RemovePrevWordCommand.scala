package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the previous word.
  */
trait RemovePrevWordCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemovePrevWordCommand command.
    */
  def execute(): Boolean
}
object RemovePrevWordCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemovePrevWordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemovePrevWordCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemovePrevWordCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
