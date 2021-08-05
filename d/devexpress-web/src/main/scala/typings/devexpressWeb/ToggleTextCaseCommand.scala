package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle the case for each character - upper case becomes lower, lower case becomes upper.
  */
trait ToggleTextCaseCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the ToggleTextCaseCommand command.
    */
  def execute(): Boolean
}
object ToggleTextCaseCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTextCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTextCaseCommand]
  }
  
  extension [Self <: ToggleTextCaseCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
