package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the previous page header or footer in the header/footer editing mode.
  */
@js.native
trait GoToPreviousHeaderFooterCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToPreviousHeaderFooterCommand command.
    */
  def execute(): Boolean = js.native
}
object GoToPreviousHeaderFooterCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToPreviousHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToPreviousHeaderFooterCommand]
  }
  
  @scala.inline
  implicit class GoToPreviousHeaderFooterCommandMutableBuilder[Self <: GoToPreviousHeaderFooterCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
