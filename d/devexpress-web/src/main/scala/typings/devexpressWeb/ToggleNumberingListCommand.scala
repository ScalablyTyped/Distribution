package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the numbered paragraph and normal text.
  */
trait ToggleNumberingListCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleNumberingListCommand command.
    */
  def execute(): Boolean
}
object ToggleNumberingListCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleNumberingListCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToggleNumberingListCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
