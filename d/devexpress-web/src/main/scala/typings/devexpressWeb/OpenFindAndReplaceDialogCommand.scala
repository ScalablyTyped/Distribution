package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Find and Replace dialog.
  */
trait OpenFindAndReplaceDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenFindAndReplaceDialogCommand command.
    */
  def execute(): Boolean
}
object OpenFindAndReplaceDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenFindAndReplaceDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenFindAndReplaceDialogCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenFindAndReplaceDialogCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
