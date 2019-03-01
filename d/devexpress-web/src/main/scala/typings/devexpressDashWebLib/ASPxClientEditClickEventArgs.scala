package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side events which concern clicking within editors.
  */
trait ASPxClientEditClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the HTML element related to the event.
    * Value: An object that represents the clicked HTML element.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
}

object ASPxClientEditClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Object, htmlEvent: js.Object): ASPxClientEditClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.asInstanceOf[ASPxClientEditClickEventArgs]
  }
}

