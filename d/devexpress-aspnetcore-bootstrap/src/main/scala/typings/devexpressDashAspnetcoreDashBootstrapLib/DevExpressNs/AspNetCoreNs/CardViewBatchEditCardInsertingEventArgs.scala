package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditCardInsertingEventArgs extends CancelEventArgs {
  val visibleIndex: scala.Double
}

object CardViewBatchEditCardInsertingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, sender: Control, visibleIndex: scala.Double): CardViewBatchEditCardInsertingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[CardViewBatchEditCardInsertingEventArgs]
  }
}

