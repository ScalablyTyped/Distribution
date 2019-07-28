package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditRowDeletingEventArgs extends CancelEventArgs {
  val rowValues: js.Any
  val visibleIndex: Double
}

object GridViewBatchEditRowDeletingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, rowValues: js.Any, sender: Control, visibleIndex: Double): GridViewBatchEditRowDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, rowValues = rowValues, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditRowDeletingEventArgs]
  }
}

