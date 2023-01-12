package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Margins tab of the Page Setup dialog.
  */
trait OpenPageMarginsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenPageMarginsDialogCommand command.
    */
  def execute(): Boolean
}
object OpenPageMarginsDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenPageMarginsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenPageMarginsDialogCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenPageMarginsDialogCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
