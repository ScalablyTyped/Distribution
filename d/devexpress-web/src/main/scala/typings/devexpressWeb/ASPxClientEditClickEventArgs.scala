package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side events which concern clicking within editors.
  */
trait ASPxClientEditClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the HTML element related to the event.
    */
  var htmlElement: js.Any
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}

object ASPxClientEditClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any): ASPxClientEditClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEditClickEventArgs]
  }
}

