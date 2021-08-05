package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Tabs paragraph dialog.
  */
trait OpenTabsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenTabsDialogCommand command.
    */
  def execute(): Boolean
}
object OpenTabsDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenTabsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenTabsDialogCommand]
  }
  
  extension [Self <: OpenTabsDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
