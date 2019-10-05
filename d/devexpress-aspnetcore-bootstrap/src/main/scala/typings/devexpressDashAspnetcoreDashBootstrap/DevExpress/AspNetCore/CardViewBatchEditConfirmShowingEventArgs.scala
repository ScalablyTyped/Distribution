package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditConfirmShowingEventArgs extends CancelEventArgs {
  val requestTriggerID: String
}

object CardViewBatchEditConfirmShowingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, requestTriggerID: String, sender: Control): CardViewBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, requestTriggerID = requestTriggerID, sender = sender)
  
    __obj.asInstanceOf[CardViewBatchEditConfirmShowingEventArgs]
  }
}

