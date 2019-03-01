package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the KeyUp event.
  */
trait ASPxClientRichEditKeyUpEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
}

object ASPxClientRichEditKeyUpEventArgs {
  @scala.inline
  def apply(htmlEvent: js.Object): ASPxClientRichEditKeyUpEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.asInstanceOf[ASPxClientRichEditKeyUpEventArgs]
  }
}

