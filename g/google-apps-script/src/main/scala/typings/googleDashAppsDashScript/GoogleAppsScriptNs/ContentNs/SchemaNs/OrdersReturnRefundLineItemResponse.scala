package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersReturnRefundLineItemResponse extends js.Object {
  var executionStatus: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object OrdersReturnRefundLineItemResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): OrdersReturnRefundLineItemResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersReturnRefundLineItemResponse]
  }
}

