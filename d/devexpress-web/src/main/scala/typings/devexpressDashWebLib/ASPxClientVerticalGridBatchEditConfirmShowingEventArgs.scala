package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditConfirmShowing event.
  */
trait ASPxClientVerticalGridBatchEditConfirmShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the client identifier of an object that initiates a send request.
    * Value: A string value that specifies the object client identifier.
    */
  var requestTriggerID: java.lang.String
}

object ASPxClientVerticalGridBatchEditConfirmShowingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, requestTriggerID: java.lang.String): ASPxClientVerticalGridBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("requestTriggerID")(requestTriggerID)
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditConfirmShowingEventArgs]
  }
}

