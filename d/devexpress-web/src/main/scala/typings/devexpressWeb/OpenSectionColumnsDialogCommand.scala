package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Columns dialog.
  */
trait OpenSectionColumnsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenSectionColumnsDialogCommand command.
    */
  def execute(): Boolean
}
object OpenSectionColumnsDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenSectionColumnsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenSectionColumnsDialogCommand]
  }
  
  extension [Self <: OpenSectionColumnsDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
