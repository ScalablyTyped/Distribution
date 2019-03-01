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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("focusedColumn")(focusedColumn)
    __obj.updateDynamic("rowValues")(rowValues)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[GridViewBatchEditStartEditingEventArgs]
  }
}

