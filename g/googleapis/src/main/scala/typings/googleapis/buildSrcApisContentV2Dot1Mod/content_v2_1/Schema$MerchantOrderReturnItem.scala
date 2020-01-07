package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$MerchantOrderReturnItem extends js.Object {
  var customerReturnReason: js.UndefOr[Schema$CustomerReturnReason] = js.native
  var itemId: js.UndefOr[String] = js.native
  var merchantReturnReason: js.UndefOr[Schema$RefundReason] = js.native
  var product: js.UndefOr[Schema$OrderLineItemProduct] = js.native
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.native
  var state: js.UndefOr[String] = js.native
}

object Schema$MerchantOrderReturnItem {
  @scala.inline
  def apply(
    customerReturnReason: Schema$CustomerReturnReason = null,
    itemId: String = null,
    merchantReturnReason: Schema$RefundReason = null,
    product: Schema$OrderLineItemProduct = null,
    returnShipmentIds: js.Array[String] = null,
    state: String = null
  ): Schema$MerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    if (customerReturnReason != null) __obj.updateDynamic("customerReturnReason")(customerReturnReason.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (merchantReturnReason != null) __obj.updateDynamic("merchantReturnReason")(merchantReturnReason.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (returnShipmentIds != null) __obj.updateDynamic("returnShipmentIds")(returnShipmentIds.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MerchantOrderReturnItem]
  }
}

