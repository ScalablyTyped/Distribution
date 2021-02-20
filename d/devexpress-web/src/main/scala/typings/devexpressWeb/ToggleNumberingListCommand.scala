package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the numbered paragraph and normal text.
  */
@js.native
trait ToggleNumberingListCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleNumberingListCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleNumberingListCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleNumberingListCommand]
  }
  
  @scala.inline
  implicit class ToggleNumberingListCommandMutableBuilder[Self <: ToggleNumberingListCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
