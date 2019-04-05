package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersRejectReturnLineItemResponse extends js.Object {
  var executionStatus: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersRejectReturnLineItemResponse {
  @scala.inline
  def apply(executionStatus: java.lang.String = null, kind: java.lang.String = null): OrdersRejectReturnLineItemResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersRejectReturnLineItemResponse]
  }
}

