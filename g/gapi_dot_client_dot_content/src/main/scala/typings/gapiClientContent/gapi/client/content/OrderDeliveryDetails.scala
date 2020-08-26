package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderDeliveryDetails extends js.Object {
  /** The delivery address */
  var address: js.UndefOr[OrderAddress] = js.native
  /** The phone number of the person receiving the delivery. */
  var phoneNumber: js.UndefOr[String] = js.native
}

object OrderDeliveryDetails {
  @scala.inline
  def apply(): OrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderDeliveryDetails]
  }
  @scala.inline
  implicit class OrderDeliveryDetailsOps[Self <: OrderDeliveryDetails] (val x: Self) extends AnyVal {
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
    def setAddress(value: OrderAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
  }
  
}

