package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.KeyUp event.
  */
trait ASPxClientRichEditKeyUpEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}

object ASPxClientRichEditKeyUpEventArgs {
  @scala.inline
  def apply(htmlEvent: js.Any): ASPxClientRichEditKeyUpEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditKeyUpEventArgs]
  }
}

