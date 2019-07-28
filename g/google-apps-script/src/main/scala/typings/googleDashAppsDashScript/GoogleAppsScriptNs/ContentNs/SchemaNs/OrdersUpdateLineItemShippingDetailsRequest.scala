package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateLineItemShippingDetailsRequest extends js.Object {
  var deliverByDate: js.UndefOr[String] = js.undefined
  var lineItemId: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var shipByDate: js.UndefOr[String] = js.undefined
}

object OrdersUpdateLineItemShippingDetailsRequest {
  @scala.inline
  def apply(
    deliverByDate: String = null,
    lineItemId: String = null,
    operationId: String = null,
    productId: String = null,
    shipByDate: String = null
  ): OrdersUpdateLineItemShippingDetailsRequest = {
    val __obj = js.Dynamic.literal()
    if (deliverByDate != null) __obj.updateDynamic("deliverByDate")(deliverByDate)
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (shipByDate != null) __obj.updateDynamic("shipByDate")(shipByDate)
    __obj.asInstanceOf[OrdersUpdateLineItemShippingDetailsRequest]
  }
}

