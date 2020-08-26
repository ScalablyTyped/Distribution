package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditConfirmShowing event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditConfirmShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the client identifier of an object that initiates a send request.
    */
  var requestTriggerID: String = js.native
}

object ASPxClientVerticalGridBatchEditConfirmShowingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, requestTriggerID: String): ASPxClientVerticalGridBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], requestTriggerID = requestTriggerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditConfirmShowingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditConfirmShowingEventArgsOps[Self <: ASPxClientVerticalGridBatchEditConfirmShowingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequestTriggerID(value: String): Self = this.set("requestTriggerID", value.asInstanceOf[js.Any])
  }
  
}

