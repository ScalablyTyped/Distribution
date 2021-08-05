package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to decrement the left indentation of paragraphs in a selected range.
  */
trait DecrementParagraphLeftIndentCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DecrementParagraphLeftIndentCommand command.
    */
  def execute(): Boolean
}
object DecrementParagraphLeftIndentCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecrementParagraphLeftIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DecrementParagraphLeftIndentCommand]
  }
  
  extension [Self <: DecrementParagraphLeftIndentCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
