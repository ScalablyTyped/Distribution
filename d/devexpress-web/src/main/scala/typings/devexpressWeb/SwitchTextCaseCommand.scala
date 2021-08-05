package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to switch the text case at the current position in the document.
  */
trait SwitchTextCaseCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the SwitchTextCaseCommand command.
    */
  def execute(): Boolean
}
object SwitchTextCaseCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): SwitchTextCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SwitchTextCaseCommand]
  }
  
  extension [Self <: SwitchTextCaseCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
