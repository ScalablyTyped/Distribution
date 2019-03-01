package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on items.
  */
trait BootstrapClientAccordionItemEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets an HTML object that contains the processed Accordion item.
    * Value: An HTML object.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: A DHTML event object.
    */
  var htmlEvent: js.Object
  /**
    * Gets the item object related to the event.
    * Value: A BootstrapClientAccordionItem object, manipulations on which forced the event to be raised.
    */
  var item: BootstrapClientAccordionItem
}

object BootstrapClientAccordionItemEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Object,
    htmlEvent: js.Object,
    item: BootstrapClientAccordionItem,
    processOnServer: scala.Boolean
  ): BootstrapClientAccordionItemEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[BootstrapClientAccordionItemEventArgs]
  }
}

