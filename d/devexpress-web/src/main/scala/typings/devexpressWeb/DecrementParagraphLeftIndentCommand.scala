package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to decrement the left indentation of paragraphs in a selected range.
  */
@js.native
trait DecrementParagraphLeftIndentCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the DecrementParagraphLeftIndentCommand command.
    */
  def execute(): Boolean = js.native
}
object DecrementParagraphLeftIndentCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecrementParagraphLeftIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DecrementParagraphLeftIndentCommand]
  }
  
  @scala.inline
  implicit class DecrementParagraphLeftIndentCommandMutableBuilder[Self <: DecrementParagraphLeftIndentCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
