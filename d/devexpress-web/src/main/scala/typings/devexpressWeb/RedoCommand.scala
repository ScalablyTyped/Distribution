package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to reverse actions of the previous undo command.
  */
@js.native
trait RedoCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the RedoCommand command.
    */
  def execute(): Boolean = js.native
}
object RedoCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RedoCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RedoCommand]
  }
  
  @scala.inline
  implicit class RedoCommandMutableBuilder[Self <: RedoCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
