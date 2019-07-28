package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the Click event.
  */
trait ASPxClientButtonClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Specifies whether both the event's default action and the event's bubbling upon the hierarchy of event handlers should be canceled.
    * Value: true to cancel the event's default action and the event's bubbling upon the hierarchy of event handlers; otherwise, false.
    */
  var cancelEventAndBubble: Boolean
}

object ASPxClientButtonClickEventArgs {
  @scala.inline
  def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean): ASPxClientButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientButtonClickEventArgs]
  }
}

