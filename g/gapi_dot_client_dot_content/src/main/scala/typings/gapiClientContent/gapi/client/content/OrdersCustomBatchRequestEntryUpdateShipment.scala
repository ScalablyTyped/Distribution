package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntryUpdateShipment extends js.Object {
  /**
    * The carrier handling the shipment. Not updated if missing. See shipments[].carrier in the  Orders resource representation for a list of acceptable
    * values.
    */
  var carrier: js.UndefOr[String] = js.native
  /** The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.native
  /** New status for the shipment. Not updated if missing. */
  var status: js.UndefOr[String] = js.native
  /** The tracking id for the shipment. Not updated if missing. */
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

