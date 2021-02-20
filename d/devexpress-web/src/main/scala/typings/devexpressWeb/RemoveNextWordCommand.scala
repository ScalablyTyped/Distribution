package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the next word.
  */
@js.native
trait RemoveNextWordCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveNextWordCommand command.
    */
  def execute(): Boolean = js.native
}
object RemoveNextWordCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveNextWordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveNextWordCommand]
  }
  
  @scala.inline
  implicit class RemoveNextWordCommandMutableBuilder[Self <: RemoveNextWordCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
