package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on items.
  */
trait BootstrapClientAccordionItemEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets an HTML object that contains the processed Accordion item.
    */
  var htmlElement: js.Any
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  /**
    * Gets the item object related to the event.
    */
  var item: BootstrapClientAccordionItem
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
}

