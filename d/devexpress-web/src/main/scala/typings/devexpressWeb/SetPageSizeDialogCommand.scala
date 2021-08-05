package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to set the page size.
  */
trait SetPageSizeDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the SetPageSizeDialogCommand command.
    */
  def execute(): Boolean
}
object SetPageSizeDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): SetPageSizeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetPageSizeDialogCommand]
  }
  
  extension [Self <: SetPageSizeDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
