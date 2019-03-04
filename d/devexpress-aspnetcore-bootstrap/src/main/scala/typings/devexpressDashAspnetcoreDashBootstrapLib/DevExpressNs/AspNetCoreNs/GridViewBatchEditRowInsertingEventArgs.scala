package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditRowInsertingEventArgs extends CancelEventArgs {
  val visibleIndex: scala.Double
}

object GridViewBatchEditRowInsertingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, sender: Control, visibleIndex: scala.Double): GridViewBatchEditRowInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditRowInsertingEventArgs]
  }
}

