package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a PAGE field displaying the current page number.
  */
trait CreatePageFieldCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the CreatePageFieldCommand command.
    */
  def execute(): Boolean
}
object CreatePageFieldCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CreatePageFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CreatePageFieldCommand]
  }
  
  @scala.inline
  implicit class CreatePageFieldCommandMutableBuilder[Self <: CreatePageFieldCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
