package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientButton.Click event.
  */
@JSGlobal("ASPxClientButtonClickEventArgs")
@js.native
class ASPxClientButtonClickEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientButtonClickEventArgs class with the specified settings.
    * @param processOnServer true to process the event on the server side; false to handle it completely on the client side. Initializes the ASPxClientProcessingModeEventArgs.processOnServer property.
    * @param cancelEventAndBubble true to cancel both the event's default action and the event's bubbling upon the hierarchy of event handlers; otherwise, false. Initializes the ASPxClientButtonClickEventArgs.cancelEventAndBubble property.
    */
  def this(processOnServer: Boolean, cancelEventAndBubble: Boolean) = this()
  /**
    * Specifies whether both the event's default action and the event's bubbling upon the hierarchy of event handlers should be canceled.
    */
  var cancelEventAndBubble: Boolean = js.native
}

