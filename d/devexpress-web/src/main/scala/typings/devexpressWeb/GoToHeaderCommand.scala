package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the page header from the page footer in the header/footer editing mode.
  */
@js.native
trait GoToHeaderCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToHeaderCommand command.
    */
  def execute(): Boolean = js.native
}
object GoToHeaderCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToHeaderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToHeaderCommand]
  }
  
  @scala.inline
  implicit class GoToHeaderCommandMutableBuilder[Self <: GoToHeaderCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
