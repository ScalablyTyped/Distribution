package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a TIME field displaying the current time.
  */
trait CreateTimeFieldCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the CreateTimeFieldCommand command.
    */
  def execute(): Boolean
}
object CreateTimeFieldCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): CreateTimeFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CreateTimeFieldCommand]
  }
  
  extension [Self <: CreateTimeFieldCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
