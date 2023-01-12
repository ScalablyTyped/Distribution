package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to reset the selected text's formatting to default.
  */
trait ClearFormattingCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the ClearFormattingCommand command.
    */
  def execute(): Boolean
}
object ClearFormattingCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): ClearFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ClearFormattingCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearFormattingCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
