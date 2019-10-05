package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditStartEditingEventArgs extends CancelEventArgs {
  val cardValues: js.Any
  var focusedColumn: BootstrapCardViewColumn
  val visibleIndex: Double
}

object CardViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    cardValues: js.Any,
    focusedColumn: BootstrapCardViewColumn,
    sender: Control,
    visibleIndex: Double
  ): CardViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cardValues = cardValues, focusedColumn = focusedColumn, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[CardViewBatchEditStartEditingEventArgs]
  }
}

