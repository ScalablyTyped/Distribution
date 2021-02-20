package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Image dialog.
  */
@js.native
trait OpenInsertPictureDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenInsertPictureDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenInsertPictureDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertPictureDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertPictureDialogCommand]
  }
  
  @scala.inline
  implicit class OpenInsertPictureDialogCommandMutableBuilder[Self <: OpenInsertPictureDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
