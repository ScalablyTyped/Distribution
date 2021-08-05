package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to increment the indent level of paragraphs in a selected numbered list.
  */
trait IncrementNumberingIndentCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the IncrementNumberingIndentCommand command.
    */
  def execute(): Boolean
}
object IncrementNumberingIndentCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncrementNumberingIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncrementNumberingIndentCommand]
  }
  
  extension [Self <: IncrementNumberingIndentCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
