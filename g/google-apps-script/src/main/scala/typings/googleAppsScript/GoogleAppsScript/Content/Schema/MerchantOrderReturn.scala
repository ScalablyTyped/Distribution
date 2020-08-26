package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantOrderReturn extends js.Object {
  var creationDate: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var orderId: js.UndefOr[String] = js.native
  var orderReturnId: js.UndefOr[String] = js.native
  var returnItems: js.UndefOr[js.Array[MerchantOrderReturnItem]] = js.native
  var returnShipments: js.UndefOr[js.Array[ReturnShipment]] = js.native
}

object MerchantOrderReturn {
  @scala.inline
  def apply(): MerchantOrderReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantOrderReturn]
  }
  @scala.inline
  implicit class MerchantOrderReturnOps[Self <: MerchantOrderReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    @scala.inline
    def setOrderReturnId(value: String): Self = this.set("orderReturnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderReturnId: Self = this.set("orderReturnId", js.undefined)
    @scala.inline
    def setReturnItemsVarargs(value: MerchantOrderReturnItem*): Self = this.set("returnItems", js.Array(value :_*))
    @scala.inline
    def setReturnItems(value: js.Array[MerchantOrderReturnItem]): Self = this.set("returnItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnItems: Self = this.set("returnItems", js.undefined)
    @scala.inline
    def setReturnShipmentsVarargs(value: ReturnShipment*): Self = this.set("returnShipments", js.Array(value :_*))
    @scala.inline
    def setReturnShipments(value: js.Array[ReturnShipment]): Self = this.set("returnShipments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnShipments: Self = this.set("returnShipments", js.undefined)
  }
  
}

