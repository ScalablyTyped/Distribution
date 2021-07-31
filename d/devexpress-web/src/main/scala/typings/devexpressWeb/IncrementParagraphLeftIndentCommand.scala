package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to increment the left indentation of paragraphs in a selected range.
  */
trait IncrementParagraphLeftIndentCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the IncrementParagraphLeftIndentCommand command.
    */
  def execute(): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object IncrementParagraphLeftIndentCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncrementParagraphLeftIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncrementParagraphLeftIndentCommand]
  }
  
  @scala.inline
  implicit class IncrementParagraphLeftIndentCommandMutableBuilder[Self <: IncrementParagraphLeftIndentCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetState(value: () => SimpleCommandState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
