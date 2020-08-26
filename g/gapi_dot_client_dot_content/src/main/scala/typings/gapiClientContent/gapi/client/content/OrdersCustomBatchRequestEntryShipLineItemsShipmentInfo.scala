package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends js.Object {
  /** The carrier handling the shipment. See shipments[].carrier in the  Orders resource representation for a list of acceptable values. */
  var carrier: js.UndefOr[String] = js.native
  /** The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.native
  /** The tracking id for the shipment. */
  var trackingId: js.UndefOr[String] = js.native
}

object OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo {
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]
  }
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryShipLineItemsShipmentInfoOps[Self <: OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] (val x: Self) extends AnyVal {
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
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
  }
  
}

