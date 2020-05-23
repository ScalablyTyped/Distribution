package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the corresponding event.
  */
trait ASPxClientCardViewFocusEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether card focusing has been changed on the server.
    */
  var isChangedOnServer: Boolean
}

object ASPxClientCardViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean): ASPxClientCardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewFocusEventArgs]
  }
}

