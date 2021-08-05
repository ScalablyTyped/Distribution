package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.KeyUp event.
  */
trait ASPxClientRichEditKeyUpEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}
object ASPxClientRichEditKeyUpEventArgs {
  
  inline def apply(htmlEvent: js.Any): ASPxClientRichEditKeyUpEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditKeyUpEventArgs]
  }
  
  extension [Self <: ASPxClientRichEditKeyUpEventArgs](x: Self) {
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
