package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the page footer from the page header in the header/footer editing mode.
  */
@js.native
trait GoToFooterCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToFooterCommand command.
    */
  def execute(): Boolean = js.native
}
object GoToFooterCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToFooterCommand]
  }
  
  @scala.inline
  implicit class GoToFooterCommandMutableBuilder[Self <: GoToFooterCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
