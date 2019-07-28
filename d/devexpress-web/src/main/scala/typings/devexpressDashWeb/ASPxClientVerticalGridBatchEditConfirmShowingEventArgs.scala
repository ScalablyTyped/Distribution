package typings.devexpressDashWeb

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
  var requestTriggerID: String
}

object ASPxClientVerticalGridBatchEditConfirmShowingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, requestTriggerID: String): ASPxClientVerticalGridBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, requestTriggerID = requestTriggerID)
  
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditConfirmShowingEventArgs]
  }
}

