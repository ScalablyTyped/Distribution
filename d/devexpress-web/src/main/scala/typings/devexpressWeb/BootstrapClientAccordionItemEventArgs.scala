package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on items.
  */
trait BootstrapClientAccordionItemEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets an HTML object that contains the processed Accordion item.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
  
  /**
    * Gets the item object related to the event.
    */
  var item: BootstrapClientAccordionItem
}
object BootstrapClientAccordionItemEventArgs {
  
  inline def apply(htmlElement: Any, htmlEvent: Any, item: BootstrapClientAccordionItem, processOnServer: Boolean): BootstrapClientAccordionItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionItemEventArgs]
  }
  
  extension [Self <: BootstrapClientAccordionItemEventArgs](x: Self) {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setItem(value: BootstrapClientAccordionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
