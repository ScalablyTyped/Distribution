package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected hyperlink.
  */
trait DeleteHyperlinkCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteHyperlinkCommand command.
    */
  def execute(): Boolean
}
object DeleteHyperlinkCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteHyperlinkCommand]
  }
  
  extension [Self <: DeleteHyperlinkCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
