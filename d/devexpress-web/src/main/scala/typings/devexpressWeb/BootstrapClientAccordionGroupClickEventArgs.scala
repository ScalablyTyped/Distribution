package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to clicking on the control's group headers.
  */
trait BootstrapClientAccordionGroupClickEventArgs
  extends StObject
     with BootstrapClientAccordionGroupCancelEventArgs {
  
  /**
    * Gets an HTML object that contains the processed Accordion group.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
}
object BootstrapClientAccordionGroupClickEventArgs {
  
  inline def apply(
    cancel: Boolean,
    group: BootstrapClientAccordionGroup,
    htmlElement: Any,
    htmlEvent: Any,
    processOnServer: Boolean
  ): BootstrapClientAccordionGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroupClickEventArgs]
  }
  
  extension [Self <: BootstrapClientAccordionGroupClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
