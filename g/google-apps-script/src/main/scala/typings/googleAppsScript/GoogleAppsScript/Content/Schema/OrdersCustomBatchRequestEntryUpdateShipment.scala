package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntryUpdateShipment extends js.Object {
  var carrier: js.UndefOr[String] = js.native
  var deliveryDate: js.UndefOr[String] = js.native
  var shipmentId: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var trackingId: js.UndefOr[String] = js.native
}

object OrdersCustomBatchRequestEntryUpdateShipment {
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryUpdateShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryUpdateShipment]
  }
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryUpdateShipmentOps[Self <: OrdersCustomBatchRequestEntryUpdateShipment] (val x: Self) extends AnyVal {
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
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    @scala.inline
    def setDeliveryDate(value: String): Self = this.set("deliveryDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryDate: Self = this.set("deliveryDate", js.undefined)
    @scala.inline
    def setShipmentId(value: String): Self = this.set("shipmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipmentId: Self = this.set("shipmentId", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
  }
  
}

