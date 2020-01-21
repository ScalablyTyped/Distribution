package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateMerchantOrderIdRequest extends js.Object {
  var merchantOrderId: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
}

object OrdersUpdateMerchantOrderIdRequest {
  @scala.inline
  def apply(merchantOrderId: String = null, operationId: String = null): OrdersUpdateMerchantOrderIdRequest = {
    val __obj = js.Dynamic.literal()
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersUpdateMerchantOrderIdRequest]
  }
}

