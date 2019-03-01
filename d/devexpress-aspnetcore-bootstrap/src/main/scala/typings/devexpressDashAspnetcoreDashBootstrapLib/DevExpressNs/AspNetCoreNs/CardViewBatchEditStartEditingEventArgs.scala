package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditStartEditingEventArgs extends CancelEventArgs {
  val cardValues: js.Any
  var focusedColumn: BootstrapCardViewColumn
  val visibleIndex: scala.Double
}

object CardViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    cardValues: js.Any,
    focusedColumn: BootstrapCardViewColumn,
    sender: Control,
    visibleIndex: scala.Double
  ): CardViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("cardValues")(cardValues)
    __obj.updateDynamic("focusedColumn")(focusedColumn)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[CardViewBatchEditStartEditingEventArgs]
  }
}

