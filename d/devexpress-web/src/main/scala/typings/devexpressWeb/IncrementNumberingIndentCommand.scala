package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to increment the indent level of paragraphs in a selected numbered list.
  */
@js.native
trait IncrementNumberingIndentCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the IncrementNumberingIndentCommand command.
    */
  def execute(): Boolean = js.native
}
object IncrementNumberingIndentCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncrementNumberingIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncrementNumberingIndentCommand]
  }
  
  @scala.inline
  implicit class IncrementNumberingIndentCommandMutableBuilder[Self <: IncrementNumberingIndentCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
