package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersUpdateMerchantOrderIdRequest extends js.Object {
  /**
    * The merchant order id to be assigned to the order. Must be unique per
    * merchant.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
}

object Schema$OrdersUpdateMerchantOrderIdRequest {
  @scala.inline
  def apply(merchantOrderId: String = null, operationId: String = null): Schema$OrdersUpdateMerchantOrderIdRequest = {
    val __obj = js.Dynamic.literal()
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersUpdateMerchantOrderIdRequest]
  }
}

