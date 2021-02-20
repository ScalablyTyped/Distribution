package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Table Properties dialog.
  */
@js.native
trait OpenTableFormattingDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenTableFormattingDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenTableFormattingDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenTableFormattingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenTableFormattingDialogCommand]
  }
  
  @scala.inline
  implicit class OpenTableFormattingDialogCommandMutableBuilder[Self <: OpenTableFormattingDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
