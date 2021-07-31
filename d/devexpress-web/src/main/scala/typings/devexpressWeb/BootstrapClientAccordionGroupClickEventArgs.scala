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
  var htmlElement: js.Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}
object BootstrapClientAccordionGroupClickEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    group: BootstrapClientAccordionGroup,
    htmlElement: js.Any,
    htmlEvent: js.Any,
    processOnServer: Boolean
  ): BootstrapClientAccordionGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroupClickEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientAccordionGroupClickEventArgsMutableBuilder[Self <: BootstrapClientAccordionGroupClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
