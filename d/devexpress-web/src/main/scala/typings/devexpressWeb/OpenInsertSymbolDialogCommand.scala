package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Symbols dialog.
  */
trait OpenInsertSymbolDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenInsertSymbolDialogCommand command.
    */
  def execute(): Boolean
}
object OpenInsertSymbolDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertSymbolDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertSymbolDialogCommand]
  }
  
  extension [Self <: OpenInsertSymbolDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
