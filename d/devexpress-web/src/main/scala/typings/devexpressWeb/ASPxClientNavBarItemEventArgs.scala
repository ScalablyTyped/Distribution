package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on items.
  */
trait ASPxClientNavBarItemEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the HTML object that contains the processed navbar item.
    */
  var htmlElement: js.Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  
  /**
    * Gets the item object related to the event.
    */
  var item: ASPxClientNavBarItem
}
object ASPxClientNavBarItemEventArgs {
  
  inline def apply(htmlElement: js.Any, htmlEvent: js.Any, item: ASPxClientNavBarItem, processOnServer: Boolean): ASPxClientNavBarItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarItemEventArgs]
  }
  
  extension [Self <: ASPxClientNavBarItemEventArgs](x: Self) {
    
    inline def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ASPxClientNavBarItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
