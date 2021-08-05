package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Table Properties dialog.
  */
trait OpenTableFormattingDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenTableFormattingDialogCommand command.
    */
  def execute(): Boolean
}
object OpenTableFormattingDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenTableFormattingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenTableFormattingDialogCommand]
  }
  
  extension [Self <: OpenTableFormattingDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
