package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to reverse actions of the previous undo command.
  */
trait RedoCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RedoCommand command.
    */
  def execute(): Boolean
}
object RedoCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): RedoCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RedoCommand]
  }
  
  extension [Self <: RedoCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
