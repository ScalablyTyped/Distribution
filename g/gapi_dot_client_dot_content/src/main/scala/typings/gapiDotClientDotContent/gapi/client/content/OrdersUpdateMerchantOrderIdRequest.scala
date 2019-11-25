package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateMerchantOrderIdRequest extends js.Object {
  /** The merchant order id to be assigned to the order. Must be unique per merchant. */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
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

