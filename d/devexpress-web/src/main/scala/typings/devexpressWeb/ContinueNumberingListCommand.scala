package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to continue the list's numbering.
  */
trait ContinueNumberingListCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the ContinueNumberingListCommand command.
    */
  def execute(): Boolean
}
object ContinueNumberingListCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): ContinueNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ContinueNumberingListCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueNumberingListCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
