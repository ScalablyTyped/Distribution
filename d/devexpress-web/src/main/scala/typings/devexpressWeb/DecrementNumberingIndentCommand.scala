package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to decrement the indent level of paragraphs in a selected numbered list.
  */
@js.native
trait DecrementNumberingIndentCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the DecrementNumberingIndentCommand command.
    */
  def execute(): Boolean = js.native
}
object DecrementNumberingIndentCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecrementNumberingIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DecrementNumberingIndentCommand]
  }
  
  @scala.inline
  implicit class DecrementNumberingIndentCommandMutableBuilder[Self <: DecrementNumberingIndentCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
