package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditStartEditingEventArgs extends CancelEventArgs {
  var focusedColumn: BootstrapGridViewColumn
  val rowValues: js.Any
  val visibleIndex: Double
}

object GridViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    focusedColumn: BootstrapGridViewColumn,
    rowValues: js.Any,
    sender: Control,
    visibleIndex: Double
  ): GridViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, focusedColumn = focusedColumn, rowValues = rowValues, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditStartEditingEventArgs]
  }
}

