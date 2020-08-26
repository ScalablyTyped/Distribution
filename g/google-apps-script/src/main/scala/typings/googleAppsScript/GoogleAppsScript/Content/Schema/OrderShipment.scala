package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderShipment extends js.Object {
  var carrier: js.UndefOr[String] = js.native
  var creationDate: js.UndefOr[String] = js.native
  var deliveryDate: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.native
  var status: js.UndefOr[String] = js.native
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

