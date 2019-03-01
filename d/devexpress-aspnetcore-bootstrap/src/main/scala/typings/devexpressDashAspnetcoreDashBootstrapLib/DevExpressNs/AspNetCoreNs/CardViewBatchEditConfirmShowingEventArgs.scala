package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditConfirmShowingEventArgs extends CancelEventArgs {
  val requestTriggerID: java.lang.String
}

object CardViewBatchEditConfirmShowingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, requestTriggerID: java.lang.String, sender: Control): CardViewBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("requestTriggerID")(requestTriggerID)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[CardViewBatchEditConfirmShowingEventArgs]
  }
}

