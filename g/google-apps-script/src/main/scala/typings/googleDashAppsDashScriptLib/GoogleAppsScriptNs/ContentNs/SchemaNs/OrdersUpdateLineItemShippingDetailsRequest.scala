package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateLineItemShippingDetailsRequest extends js.Object {
  var deliverByDate: js.UndefOr[java.lang.String] = js.undefined
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var shipByDate: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersUpdateLineItemShippingDetailsRequest {
  @scala.inline
  def apply(
    deliverByDate: java.lang.String = null,
    lineItemId: java.lang.String = null,
    operationId: java.lang.String = null,
    productId: java.lang.String = null,
    shipByDate: java.lang.String = null
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

