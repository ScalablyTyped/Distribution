package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionGroupClickEventArgs
  extends StObject
     with AccordionGroupCancelEventArgs {
  
  val htmlElement: js.Object
  
  val htmlEvent: js.Object
}
object AccordionGroupClickEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    group: BootstrapAccordionGroup,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: Boolean,
    sender: Control
  ): AccordionGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionGroupClickEventArgs]
  }
  
  @scala.inline
  implicit class AccordionGroupClickEventArgsMutableBuilder[Self <: AccordionGroupClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Object): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Object): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
