package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events involved with a key being pressed or released.
  */
trait ASPxClientEditKeyEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}

object ASPxClientEditKeyEventArgs {
  @scala.inline
  def apply(htmlEvent: js.Any): ASPxClientEditKeyEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEditKeyEventArgs]
  }
}

