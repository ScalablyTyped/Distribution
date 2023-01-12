package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to decrement the indent level of paragraphs in a selected numbered list.
  */
trait DecrementNumberingIndentCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DecrementNumberingIndentCommand command.
    */
  def execute(): Boolean
}
object DecrementNumberingIndentCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecrementNumberingIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DecrementNumberingIndentCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecrementNumberingIndentCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
