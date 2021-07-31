package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Layout dialog.
  */
trait OpenLayoutOptionsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenLayoutOptionsDialogCommand command.
    */
  def execute(): Boolean
}
object OpenLayoutOptionsDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenLayoutOptionsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenLayoutOptionsDialogCommand]
  }
  
  @scala.inline
  implicit class OpenLayoutOptionsDialogCommandMutableBuilder[Self <: OpenLayoutOptionsDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
