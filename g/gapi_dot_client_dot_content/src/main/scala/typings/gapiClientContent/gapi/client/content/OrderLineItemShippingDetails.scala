package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLineItemShippingDetails extends js.Object {
  /** The delivery by date, in ISO 8601 format. */
  var deliverByDate: js.UndefOr[String] = js.native
  /** Details of the shipping method. */
  var method: js.UndefOr[OrderLineItemShippingDetailsMethod] = js.native
  /** The ship by date, in ISO 8601 format. */
  var shipByDate: js.UndefOr[String] = js.native
}

object OrderLineItemShippingDetails {
  @scala.inline
  def apply(): OrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemShippingDetails]
  }
  @scala.inline
  implicit class OrderLineItemShippingDetailsOps[Self <: OrderLineItemShippingDetails] (val x: Self) extends AnyVal {
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
    def setDeliverByDate(value: String): Self = this.set("deliverByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverByDate: Self = this.set("deliverByDate", js.undefined)
    @scala.inline
    def setMethod(value: OrderLineItemShippingDetailsMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setShipByDate(value: String): Self = this.set("shipByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipByDate: Self = this.set("shipByDate", js.undefined)
  }
  
}

