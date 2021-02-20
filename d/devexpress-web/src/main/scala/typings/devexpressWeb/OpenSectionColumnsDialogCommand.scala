package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Columns dialog.
  */
@js.native
trait OpenSectionColumnsDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenSectionColumnsDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenSectionColumnsDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenSectionColumnsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenSectionColumnsDialogCommand]
  }
  
  @scala.inline
  implicit class OpenSectionColumnsDialogCommandMutableBuilder[Self <: OpenSectionColumnsDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
