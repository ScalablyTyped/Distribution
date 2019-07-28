package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on the control's items.
  */
trait ASPxClientTitleIndexItemEventArgs extends ASPxClientProcessingModeEventArgs {
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

object ASPxClientTitleIndexItemEventArgs {
  @scala.inline
  def apply(htmlElement: js.Object, htmlEvent: js.Object, name: js.Object, processOnServer: Boolean): ASPxClientTitleIndexItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement, htmlEvent = htmlEvent, name = name, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientTitleIndexItemEventArgs]
  }
}

