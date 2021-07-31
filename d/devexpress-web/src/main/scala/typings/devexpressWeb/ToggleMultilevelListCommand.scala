package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the multilevel list style and normal text.
  */
trait ToggleMultilevelListCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleMultilevelListCommand command.
    */
  def execute(): Boolean
}
object ToggleMultilevelListCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleMultilevelListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleMultilevelListCommand]
  }
  
  @scala.inline
  implicit class ToggleMultilevelListCommandMutableBuilder[Self <: ToggleMultilevelListCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
