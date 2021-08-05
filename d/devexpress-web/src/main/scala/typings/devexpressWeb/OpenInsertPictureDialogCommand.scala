package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Image dialog.
  */
trait OpenInsertPictureDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenInsertPictureDialogCommand command.
    */
  def execute(): Boolean
}
object OpenInsertPictureDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertPictureDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertPictureDialogCommand]
  }
  
  extension [Self <: OpenInsertPictureDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
