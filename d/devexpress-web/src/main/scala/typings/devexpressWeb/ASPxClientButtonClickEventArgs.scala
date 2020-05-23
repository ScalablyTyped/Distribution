package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientButton.Click event.
  */
trait ASPxClientButtonClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Specifies whether both the event's default action and the event's bubbling upon the hierarchy of event handlers should be canceled.
    */
  var cancelEventAndBubble: Boolean
}

object ASPxClientButtonClickEventArgs {
  @scala.inline
  def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean): ASPxClientButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButtonClickEventArgs]
  }
}

