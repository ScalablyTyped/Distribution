package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Search Panel allowing end-users to search text and navigate through search results.
  */
trait OpenFindPanelCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenFindPanelCommand command.
    */
  def execute(): Boolean
}
object OpenFindPanelCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenFindPanelCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenFindPanelCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenFindPanelCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
