package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditClickEventArgs
  extends StObject
     with EventArgs {
  
  val htmlElement: Any
  
  val htmlEvent: Any
}
object EditClickEventArgs {
  
  inline def apply(htmlElement: Any, htmlEvent: Any, sender: Control): EditClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
