package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var executionStatus: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object OrdersCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    errors: Errors = null,
    executionStatus: java.lang.String = null,
    kind: java.lang.String = null,
    order: Order = null
  ): OrdersCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[OrdersCustomBatchResponseEntry]
  }
}

