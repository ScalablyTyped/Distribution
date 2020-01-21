package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (deliverByDate != null) __obj.updateDynamic("deliverByDate")(deliverByDate.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (shipByDate != null) __obj.updateDynamic("shipByDate")(shipByDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersUpdateLineItemShippingDetailsRequest]
  }
}

