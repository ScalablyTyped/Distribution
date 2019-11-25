package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

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
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (orderReturnId != null) __obj.updateDynamic("orderReturnId")(orderReturnId.asInstanceOf[js.Any])
    if (returnItems != null) __obj.updateDynamic("returnItems")(returnItems.asInstanceOf[js.Any])
    if (returnShipments != null) __obj.updateDynamic("returnShipments")(returnShipments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantOrderReturn]
  }
}

