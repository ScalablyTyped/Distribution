package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantOrderReturnItem extends js.Object {
  var customerReturnReason: js.UndefOr[CustomerReturnReason] = js.undefined
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  var merchantReturnReason: js.UndefOr[RefundReason] = js.undefined
  var product: js.UndefOr[OrderLineItemProduct] = js.undefined
  var returnShipmentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object MerchantOrderReturnItem {
  @scala.inline
  def apply(
    customerReturnReason: CustomerReturnReason = null,
    itemId: java.lang.String = null,
    merchantReturnReason: RefundReason = null,
    product: OrderLineItemProduct = null,
    returnShipmentIds: js.Array[java.lang.String] = null,
    state: java.lang.String = null
  ): MerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    if (customerReturnReason != null) __obj.updateDynamic("customerReturnReason")(customerReturnReason)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (merchantReturnReason != null) __obj.updateDynamic("merchantReturnReason")(merchantReturnReason)
    if (product != null) __obj.updateDynamic("product")(product)
    if (returnShipmentIds != null) __obj.updateDynamic("returnShipmentIds")(returnShipmentIds)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[MerchantOrderReturnItem]
  }
}

