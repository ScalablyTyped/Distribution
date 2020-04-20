package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditStartEditingEventArgs]
  }
}

