package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateMerchantOrderIdRequest extends js.Object {
  /** The merchant order id to be assigned to the order. Must be unique per merchant. */
  var merchantOrderId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersUpdateMerchantOrderIdRequest {
  @scala.inline
  def apply(merchantOrderId: java.lang.String = null, operationId: java.lang.String = null): OrdersUpdateMerchantOrderIdRequest = {
    val __obj = js.Dynamic.literal()
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    __obj.asInstanceOf[OrdersUpdateMerchantOrderIdRequest]
  }
}

