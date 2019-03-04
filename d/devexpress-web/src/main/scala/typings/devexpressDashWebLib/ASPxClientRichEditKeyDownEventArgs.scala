package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the KeyDown event.
  */
trait ASPxClientRichEditKeyDownEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
    * Value: true if the event is handled and no default processing is required; otherwise false.
    */
  var handled: scala.Boolean
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
}

object ASPxClientRichEditKeyDownEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, htmlEvent: js.Object): ASPxClientRichEditKeyDownEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, htmlEvent = htmlEvent)
  
    __obj.asInstanceOf[ASPxClientRichEditKeyDownEventArgs]
  }
}

