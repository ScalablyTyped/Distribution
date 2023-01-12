package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to decrement the indent level of paragraphs in a selected range.
  */
trait DecreaseIndentCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DecreaseIndentCommand command.
    */
  def execute(): Boolean
}
object DecreaseIndentCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecreaseIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DecreaseIndentCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecreaseIndentCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
