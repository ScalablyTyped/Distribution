package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the selected numeration.
  */
trait RemoveNumerationCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveNumerationCommand command.
    */
  def execute(): Boolean
}
object RemoveNumerationCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveNumerationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveNumerationCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveNumerationCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
