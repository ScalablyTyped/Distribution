package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to restart the numbering list.
  */
trait RestartNumberingListCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RestartNumberingListCommand command.
    */
  def execute(): Boolean
}
object RestartNumberingListCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): RestartNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RestartNumberingListCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestartNumberingListCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
