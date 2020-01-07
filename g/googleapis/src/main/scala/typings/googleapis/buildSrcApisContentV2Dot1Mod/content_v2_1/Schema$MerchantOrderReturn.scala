package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$MerchantOrderReturn extends js.Object {
  var creationDate: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var orderId: js.UndefOr[String] = js.native
  var orderReturnId: js.UndefOr[String] = js.native
  var returnItems: js.UndefOr[js.Array[Schema$MerchantOrderReturnItem]] = js.native
  var returnShipments: js.UndefOr[js.Array[Schema$ReturnShipment]] = js.native
}

object Schema$MerchantOrderReturn {
  @scala.inline
  def apply(
    creationDate: String = null,
    merchantOrderId: String = null,
    orderId: String = null,
    orderReturnId: String = null,
    returnItems: js.Array[Schema$MerchantOrderReturnItem] = null,
    returnShipments: js.Array[Schema$ReturnShipment] = null
  ): Schema$MerchantOrderReturn = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (orderReturnId != null) __obj.updateDynamic("orderReturnId")(orderReturnId.asInstanceOf[js.Any])
    if (returnItems != null) __obj.updateDynamic("returnItems")(returnItems.asInstanceOf[js.Any])
    if (returnShipments != null) __obj.updateDynamic("returnShipments")(returnShipments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MerchantOrderReturn]
  }
}

