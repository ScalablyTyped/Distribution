package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle the case for each character - upper case becomes lower, lower case becomes upper.
  */
@js.native
trait ToggleTextCaseCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the ToggleTextCaseCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTextCaseCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTextCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTextCaseCommand]
  }
  
  @scala.inline
  implicit class ToggleTextCaseCommandMutableBuilder[Self <: ToggleTextCaseCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
