package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntryShipLineItems extends js.Object {
  /**
    * Deprecated. Please use shipmentInfo instead. The carrier handling the shipment. See shipments[].carrier in the  Orders resource representation for a
    * list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  /** Line items to ship. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.native
  /** Deprecated. Please use shipmentInfo instead. The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.native
  /** Shipment information. This field is repeated because a single line item can be shipped in several packages (and have several tracking IDs). */
  var shipmentInfos: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.native
  /** Deprecated. Please use shipmentInfo instead. The tracking id for the shipment. */
  var trackingId: js.UndefOr[String] = js.native
}

object OrdersCustomBatchRequestEntryShipLineItems {
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryShipLineItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryShipLineItems]
  }
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryShipLineItemsOps[Self <: OrdersCustomBatchRequestEntryShipLineItems] (val x: Self) extends AnyVal {
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
    def setLineItemsVarargs(value: OrderShipmentLineItemShipment*): Self = this.set("lineItems", js.Array(value :_*))
    @scala.inline
    def setLineItems(value: js.Array[OrderShipmentLineItemShipment]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    @scala.inline
    def setShipmentId(value: String): Self = this.set("shipmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipmentId: Self = this.set("shipmentId", js.undefined)
    @scala.inline
    def setShipmentInfosVarargs(value: OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo*): Self = this.set("shipmentInfos", js.Array(value :_*))
    @scala.inline
    def setShipmentInfos(value: js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]): Self = this.set("shipmentInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipmentInfos: Self = this.set("shipmentInfos", js.undefined)
    @scala.inline
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
  }
  
}

