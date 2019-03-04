package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditEndEditingEventArgs extends CancelEventArgs {
  val rowValues: js.Any
  val visibleIndex: scala.Double
}

object GridViewBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, rowValues: js.Any, sender: Control, visibleIndex: scala.Double): GridViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, rowValues = rowValues, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditEndEditingEventArgs]
  }
}

