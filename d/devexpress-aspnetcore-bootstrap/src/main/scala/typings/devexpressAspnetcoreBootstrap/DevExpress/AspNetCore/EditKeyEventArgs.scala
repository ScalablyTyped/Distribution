package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditKeyEventArgs
  extends StObject
     with EventArgs {
  
  val htmlEvent: js.Any
}
object EditKeyEventArgs {
  
  inline def apply(htmlEvent: js.Any, sender: Control): EditKeyEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditKeyEventArgs]
  }
  
  extension [Self <: EditKeyEventArgs](x: Self) {
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
