package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditEndEditingEventArgs extends CancelEventArgs {
  val rowValues: js.Any
  val visibleIndex: Double
}

object GridViewBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, rowValues: js.Any, sender: Control, visibleIndex: Double): GridViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, rowValues = rowValues, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditEndEditingEventArgs]
  }
}

