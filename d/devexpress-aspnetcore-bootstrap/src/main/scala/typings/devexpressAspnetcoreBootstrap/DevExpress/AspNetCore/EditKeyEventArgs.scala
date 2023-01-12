package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditKeyEventArgs
  extends StObject
     with EventArgs {
  
  val htmlEvent: Any
}
object EditKeyEventArgs {
  
  inline def apply(htmlEvent: Any, sender: Control): EditKeyEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditKeyEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditKeyEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
