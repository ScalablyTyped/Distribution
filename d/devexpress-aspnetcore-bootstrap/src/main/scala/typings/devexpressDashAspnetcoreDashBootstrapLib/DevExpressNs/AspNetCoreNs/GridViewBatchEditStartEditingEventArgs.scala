package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditStartEditingEventArgs extends CancelEventArgs {
  var focusedColumn: BootstrapGridViewColumn
  val rowValues: js.Any
  val visibleIndex: scala.Double
}

object GridViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    focusedColumn: BootstrapGridViewColumn,
    rowValues: js.Any,
    sender: Control,
    visibleIndex: scala.Double
  ): GridViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, focusedColumn = focusedColumn, rowValues = rowValues, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditStartEditingEventArgs]
  }
}

