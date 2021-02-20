package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Find and Replace dialog.
  */
@js.native
trait OpenFindAndReplaceDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenFindAndReplaceDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenFindAndReplaceDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenFindAndReplaceDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenFindAndReplaceDialogCommand]
  }
  
  @scala.inline
  implicit class OpenFindAndReplaceDialogCommandMutableBuilder[Self <: OpenFindAndReplaceDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
