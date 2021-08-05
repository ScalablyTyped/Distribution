package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionItemEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val htmlElement: js.Object
  
  val htmlEvent: js.Object
  
  val item: BootstrapAccordionItem
}
object AccordionItemEventArgs {
  
  inline def apply(
    htmlElement: js.Object,
    htmlEvent: js.Object,
    item: BootstrapAccordionItem,
    processOnServer: Boolean,
    sender: Control
  ): AccordionItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionItemEventArgs]
  }
  
  extension [Self <: AccordionItemEventArgs](x: Self) {
    
    inline def setHtmlElement(value: js.Object): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: js.Object): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setItem(value: BootstrapAccordionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
