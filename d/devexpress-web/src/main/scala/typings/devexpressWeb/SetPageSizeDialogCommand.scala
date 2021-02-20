package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to set the page size.
  */
@js.native
trait SetPageSizeDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the SetPageSizeDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object SetPageSizeDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): SetPageSizeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetPageSizeDialogCommand]
  }
  
  @scala.inline
  implicit class SetPageSizeDialogCommandMutableBuilder[Self <: SetPageSizeDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
