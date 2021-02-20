package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to fit the specified table to its contents.
  */
@js.native
trait ToggleTableAutoFitContentsCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the ToggleTableAutoFitContentsCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableAutoFitContentsCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTableAutoFitContentsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableAutoFitContentsCommand]
  }
  
  @scala.inline
  implicit class ToggleTableAutoFitContentsCommandMutableBuilder[Self <: ToggleTableAutoFitContentsCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
