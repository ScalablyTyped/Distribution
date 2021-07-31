package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to increment the indent level of paragraphs in a selected range.
  */
trait IncreaseIndentCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the IncreaseIndentCommand command.
    */
  def execute(): Boolean
}
object IncreaseIndentCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncreaseIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncreaseIndentCommand]
  }
  
  @scala.inline
  implicit class IncreaseIndentCommandMutableBuilder[Self <: IncreaseIndentCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
