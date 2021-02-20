package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to fit the specified table to a document's window.
  */
@js.native
trait ToggleTableAutoFitWindowCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the ToggleTableAutoFitWindowCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableAutoFitWindowCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTableAutoFitWindowCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableAutoFitWindowCommand]
  }
  
  @scala.inline
  implicit class ToggleTableAutoFitWindowCommandMutableBuilder[Self <: ToggleTableAutoFitWindowCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
