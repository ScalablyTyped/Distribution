package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to finish header/footer editing.
  */
@js.native
trait CloseHeaderFooterCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the CloseHeaderFooterCommand command.
    */
  def execute(): Boolean = js.native
}
object CloseHeaderFooterCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CloseHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CloseHeaderFooterCommand]
  }
  
  @scala.inline
  implicit class CloseHeaderFooterCommandMutableBuilder[Self <: CloseHeaderFooterCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
