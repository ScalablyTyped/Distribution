package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to link a header/footer to the previous section, so it has the same content.
  */
@js.native
trait LinkHeaderFooterToPreviousCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the LinkHeaderFooterToPreviousCommand command.
    */
  def execute(): Boolean = js.native
}
object LinkHeaderFooterToPreviousCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): LinkHeaderFooterToPreviousCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[LinkHeaderFooterToPreviousCommand]
  }
  
  @scala.inline
  implicit class LinkHeaderFooterToPreviousCommandMutableBuilder[Self <: LinkHeaderFooterToPreviousCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
