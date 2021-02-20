package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a TIME field displaying the current time.
  */
@js.native
trait CreateTimeFieldCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the CreateTimeFieldCommand command.
    */
  def execute(): Boolean = js.native
}
object CreateTimeFieldCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CreateTimeFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CreateTimeFieldCommand]
  }
  
  @scala.inline
  implicit class CreateTimeFieldCommandMutableBuilder[Self <: CreateTimeFieldCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
