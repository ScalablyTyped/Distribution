package typings
package devexpressDashWebLib

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
  var isChangedOnServer: scala.Boolean
}

object ASPxClientCardViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: scala.Boolean, processOnServer: scala.Boolean): ASPxClientCardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientCardViewFocusEventArgs]
  }
}

