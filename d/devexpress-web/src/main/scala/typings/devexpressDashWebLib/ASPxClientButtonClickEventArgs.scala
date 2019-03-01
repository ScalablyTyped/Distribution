package typings
package devexpressDashWebLib

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
  var cancelEventAndBubble: scala.Boolean
}

object ASPxClientButtonClickEventArgs {
  @scala.inline
  def apply(cancelEventAndBubble: scala.Boolean, processOnServer: scala.Boolean): ASPxClientButtonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelEventAndBubble")(cancelEventAndBubble)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientButtonClickEventArgs]
  }
}

