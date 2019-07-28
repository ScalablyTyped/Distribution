package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the corresponding event.
  */
trait ASPxClientGridViewFocusEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether the row focusing has been changed on the server.
    * Value: true , if the row focusing has been changed on the server; otherwise, false.
    */
  var isChangedOnServer: Boolean
}

object ASPxClientGridViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean): ASPxClientGridViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientGridViewFocusEventArgs]
  }
}

