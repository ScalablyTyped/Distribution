package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on items.
  */
@js.native
trait BootstrapClientAccordionItemEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets an HTML object that contains the processed Accordion item.
    */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  
  /**
    * Gets the item object related to the event.
    */
  var item: BootstrapClientAccordionItem = js.native
}
object BootstrapClientAccordionItemEventArgs {
  
  @scala.inline
  def apply(
    htmlElement: js.Any,
    htmlEvent: js.Any,
    item: BootstrapClientAccordionItem,
    processOnServer: Boolean
  ): BootstrapClientAccordionItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionItemEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientAccordionItemEventArgsOps[Self <: BootstrapClientAccordionItemEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = this.set("htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = this.set("htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: BootstrapClientAccordionItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
}
