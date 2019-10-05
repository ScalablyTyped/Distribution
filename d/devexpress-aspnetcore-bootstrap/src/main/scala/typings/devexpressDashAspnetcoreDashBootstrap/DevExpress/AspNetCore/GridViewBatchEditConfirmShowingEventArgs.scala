package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditConfirmShowingEventArgs extends CancelEventArgs {
  val requestTriggerID: String
}

object GridViewBatchEditConfirmShowingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, requestTriggerID: String, sender: Control): GridViewBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, requestTriggerID = requestTriggerID, sender = sender)
  
    __obj.asInstanceOf[GridViewBatchEditConfirmShowingEventArgs]
  }
}

