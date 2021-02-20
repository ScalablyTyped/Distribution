package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Table dialog.
  */
@js.native
trait OpenInsertTableDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenInsertTableDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenInsertTableDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertTableDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertTableDialogCommand]
  }
  
  @scala.inline
  implicit class OpenInsertTableDialogCommandMutableBuilder[Self <: OpenInsertTableDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
