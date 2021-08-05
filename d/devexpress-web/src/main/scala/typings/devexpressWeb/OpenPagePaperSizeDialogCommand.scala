package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Paper tab of the Page Setup dialog.
  */
trait OpenPagePaperSizeDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenPagePaperSizeDialogCommand command.
    */
  def execute(): Boolean
}
object OpenPagePaperSizeDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenPagePaperSizeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenPagePaperSizeDialogCommand]
  }
  
  extension [Self <: OpenPagePaperSizeDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
