package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on the control's items.
  */
trait ASPxClientTitleIndexItemEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
  
  /**
    * Gets the name that uniquely identifies the processed item.
    */
  var name: Any
}
object ASPxClientTitleIndexItemEventArgs {
  
  inline def apply(htmlElement: Any, htmlEvent: Any, name: Any, processOnServer: Boolean): ASPxClientTitleIndexItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTitleIndexItemEventArgs]
  }
  
  extension [Self <: ASPxClientTitleIndexItemEventArgs](x: Self) {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
