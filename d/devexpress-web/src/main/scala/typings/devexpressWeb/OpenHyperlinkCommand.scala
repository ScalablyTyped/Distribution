package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the document bookmark or URI (uniform resource identifier) specified for the hyperlink.
  */
trait OpenHyperlinkCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenHyperlinkCommand command.
    */
  def execute(): Boolean
}
object OpenHyperlinkCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenHyperlinkCommand]
  }
  
  extension [Self <: OpenHyperlinkCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
