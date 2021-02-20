package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Paper tab of the Page Setup dialog.
  */
@js.native
trait OpenPagePaperSizeDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenPagePaperSizeDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenPagePaperSizeDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenPagePaperSizeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenPagePaperSizeDialogCommand]
  }
  
  @scala.inline
  implicit class OpenPagePaperSizeDialogCommandMutableBuilder[Self <: OpenPagePaperSizeDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
