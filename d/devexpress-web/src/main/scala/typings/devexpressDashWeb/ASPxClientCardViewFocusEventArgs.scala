package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the corresponding event.
  */
trait ASPxClientCardViewFocusEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether card focusing has been changed on the server.
    * Value: true , if the card focusing has been changed on the server; otherwise, false.
    */
  var isChangedOnServer: Boolean
}

object ASPxClientCardViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean): ASPxClientCardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientCardViewFocusEventArgs]
  }
}

