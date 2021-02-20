package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the previous word.
  */
@js.native
trait RemovePrevWordCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the RemovePrevWordCommand command.
    */
  def execute(): Boolean = js.native
}
object RemovePrevWordCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemovePrevWordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemovePrevWordCommand]
  }
  
  @scala.inline
  implicit class RemovePrevWordCommandMutableBuilder[Self <: RemovePrevWordCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
