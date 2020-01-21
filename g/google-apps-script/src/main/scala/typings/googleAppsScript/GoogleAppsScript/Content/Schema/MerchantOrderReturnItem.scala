package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantOrderReturnItem extends js.Object {
  var customerReturnReason: js.UndefOr[CustomerReturnReason] = js.undefined
  var itemId: js.UndefOr[String] = js.undefined
  var merchantReturnReason: js.UndefOr[RefundReason] = js.undefined
  var product: js.UndefOr[OrderLineItemProduct] = js.undefined
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object MerchantOrderReturnItem {
  @scala.inline
  def apply(
    customerReturnReason: CustomerReturnReason = null,
    itemId: String = null,
    merchantReturnReason: RefundReason = null,
    product: OrderLineItemProduct = null,
    returnShipmentIds: js.Array[String] = null,
    state: String = null
  ): MerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    if (customerReturnReason != null) __obj.updateDynamic("customerReturnReason")(customerReturnReason.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (merchantReturnReason != null) __obj.updateDynamic("merchantReturnReason")(merchantReturnReason.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (returnShipmentIds != null) __obj.updateDynamic("returnShipmentIds")(returnShipmentIds.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantOrderReturnItem]
  }
}

