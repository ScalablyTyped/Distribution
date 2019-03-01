package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern clicking on the control's items.
  */
trait ASPxClientMenuItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the HTML object that contains the processed item.
    * Value: An object representing a container for the item related to the event.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
  /**
    * Gets the menu item object related to the event.
    * Value: An ASPxClientMenuItem object, manipulations on which forced the event to be raised.
    */
  var item: ASPxClientMenuItem
}

object ASPxClientMenuItemClickEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Object,
    htmlEvent: js.Object,
    item: ASPxClientMenuItem,
    processOnServer: scala.Boolean
  ): ASPxClientMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientMenuItemClickEventArgs]
  }
}

