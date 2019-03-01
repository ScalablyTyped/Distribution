package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern tail clicking within the control's items.
  */
trait ASPxClientNewsControlItemEventArgs extends ASPxClientProcessingModeEventArgs {
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
    * Gets the name that uniquely identifies the processed item.
    * Value: A string value that represents the value assigned to the processed item's Name property.
    */
  var name: js.Object
}

object ASPxClientNewsControlItemEventArgs {
  @scala.inline
  def apply(htmlElement: js.Object, htmlEvent: js.Object, name: js.Object, processOnServer: scala.Boolean): ASPxClientNewsControlItemEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientNewsControlItemEventArgs]
  }
}

