package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantOrderReturn extends js.Object {
  var creationDate: js.UndefOr[String] = js.undefined
  var merchantOrderId: js.UndefOr[String] = js.undefined
  var orderId: js.UndefOr[String] = js.undefined
  var orderReturnId: js.UndefOr[String] = js.undefined
  var returnItems: js.UndefOr[js.Array[MerchantOrderReturnItem]] = js.undefined
  var returnShipments: js.UndefOr[js.Array[ReturnShipment]] = js.undefined
}

object MerchantOrderReturn {
  @scala.inline
  def apply(
    creationDate: String = null,
    merchantOrderId: String = null,
    orderId: String = null,
    orderReturnId: String = null,
    returnItems: js.Array[MerchantOrderReturnItem] = null,
    returnShipments: js.Array[ReturnShipment] = null
  ): MerchantOrderReturn = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (orderReturnId != null) __obj.updateDynamic("orderReturnId")(orderReturnId)
    if (returnItems != null) __obj.updateDynamic("returnItems")(returnItems)
    if (returnShipments != null) __obj.updateDynamic("returnShipments")(returnShipments)
    __obj.asInstanceOf[MerchantOrderReturn]
  }
}

