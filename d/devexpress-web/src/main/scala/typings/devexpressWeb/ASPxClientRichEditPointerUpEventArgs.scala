package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.PointerUp event.
  */
trait ASPxClientRichEditPointerUpEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
    */
  var handled: Boolean
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}

object ASPxClientRichEditPointerUpEventArgs {
  @scala.inline
  def apply(handled: Boolean, htmlEvent: js.Any): ASPxClientRichEditPointerUpEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditPointerUpEventArgs]
  }
}

