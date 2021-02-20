package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the next page header or footer in the header/footer editing mode.
  */
@js.native
trait GoToNextHeaderFooterCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToNextHeaderFooterCommand command.
    */
  def execute(): Boolean = js.native
}
object GoToNextHeaderFooterCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToNextHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToNextHeaderFooterCommand]
  }
  
  @scala.inline
  implicit class GoToNextHeaderFooterCommandMutableBuilder[Self <: GoToNextHeaderFooterCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
