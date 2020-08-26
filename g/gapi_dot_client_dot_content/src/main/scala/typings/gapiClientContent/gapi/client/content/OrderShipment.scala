package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderShipment extends js.Object {
  /**
    * The carrier handling the shipment.
    *
    * Acceptable values are:
    * - "gsx"
    * - "ups"
    * - "united parcel service"
    * - "usps"
    * - "united states postal service"
    * - "fedex"
    * - "dhl"
    * - "ecourier"
    * - "cxt"
    * - "google"
    * - "on trac"
    * - "ontrac"
    * - "on-trac"
    * - "on_trac"
    * - "delvic"
    * - "dynamex"
    * - "lasership"
    * - "smartpost"
    * - "fedex smartpost"
    * - "mpx"
    * - "uds"
    * - "united delivery service"
    */
  var carrier: js.UndefOr[String] = js.native
  /** Date on which the shipment has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.native
  /** Date on which the shipment has been delivered, in ISO 8601 format. Present only if status is delievered */
  var deliveryDate: js.UndefOr[String] = js.native
  /** The id of the shipment. */
  var id: js.UndefOr[String] = js.native
  /** The line items that are shipped. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.native
  /** The status of the shipment. */
  var status: js.UndefOr[String] = js.native
  /** The tracking id for the shipment. */
  var trackingId: js.UndefOr[String] = js.native
}

object OrderShipment {
  @scala.inline
  def apply(): OrderShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderShipment]
  }
  @scala.inline
  implicit class OrderShipmentOps[Self <: OrderShipment] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDeliveryDate(value: String): Self = this.set("deliveryDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryDate: Self = this.set("deliveryDate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLineItemsVarargs(value: OrderShipmentLineItemShipment*): Self = this.set("lineItems", js.Array(value :_*))
    @scala.inline
    def setLineItems(value: js.Array[OrderShipmentLineItemShipment]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
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

