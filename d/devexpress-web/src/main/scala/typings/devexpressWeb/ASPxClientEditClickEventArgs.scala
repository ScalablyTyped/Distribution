package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client-side events which concern clicking within editors.
  */
trait ASPxClientEditClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the HTML element related to the event.
    */
  var htmlElement: js.Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}
object ASPxClientEditClickEventArgs {
  
  inline def apply(htmlElement: js.Any, htmlEvent: js.Any): ASPxClientEditClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEditClickEventArgs]
  }
  
  extension [Self <: ASPxClientEditClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
