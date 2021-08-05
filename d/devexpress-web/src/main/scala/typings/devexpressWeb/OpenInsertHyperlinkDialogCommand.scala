package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Hyperlink dialog.
  */
trait OpenInsertHyperlinkDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenInsertHyperlinkDialogCommand command.
    */
  def execute(): Boolean
}
object OpenInsertHyperlinkDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertHyperlinkDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertHyperlinkDialogCommand]
  }
  
  extension [Self <: OpenInsertHyperlinkDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
