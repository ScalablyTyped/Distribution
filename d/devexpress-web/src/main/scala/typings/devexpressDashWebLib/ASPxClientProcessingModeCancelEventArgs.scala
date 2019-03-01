package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable client-side events which allow the event's processing to be passed to the server side.
  */
trait ASPxClientProcessingModeCancelEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
}

object ASPxClientProcessingModeCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, processOnServer: scala.Boolean): ASPxClientProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientProcessingModeCancelEventArgs]
  }
}

