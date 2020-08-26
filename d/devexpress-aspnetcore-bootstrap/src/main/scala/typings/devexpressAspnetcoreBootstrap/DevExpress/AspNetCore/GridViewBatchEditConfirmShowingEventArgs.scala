package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewBatchEditConfirmShowingEventArgs extends CancelEventArgs {
  val requestTriggerID: String = js.native
}

object GridViewBatchEditConfirmShowingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, requestTriggerID: String, sender: Control): GridViewBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], requestTriggerID = requestTriggerID.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditConfirmShowingEventArgs]
  }
  @scala.inline
  implicit class GridViewBatchEditConfirmShowingEventArgsOps[Self <: GridViewBatchEditConfirmShowingEventArgs] (val x: Self) extends AnyVal {
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

