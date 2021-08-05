package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Bulleted and Numbering dialog.
  */
trait OpenNumberingListDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenNumberingListDialogCommand command.
    */
  def execute(): Boolean
}
object OpenNumberingListDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenNumberingListDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenNumberingListDialogCommand]
  }
  
  extension [Self <: OpenNumberingListDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
