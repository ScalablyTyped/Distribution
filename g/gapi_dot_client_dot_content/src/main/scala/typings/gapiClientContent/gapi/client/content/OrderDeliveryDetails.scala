package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDeliveryDetails extends js.Object {
  /** The delivery address */
  var address: js.UndefOr[OrderAddress] = js.undefined
  /** The phone number of the person receiving the delivery. */
  var phoneNumber: js.UndefOr[String] = js.undefined
}

object OrderDeliveryDetails {
  @scala.inline
  def apply(address: OrderAddress = null, phoneNumber: String = null): OrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderDeliveryDetails]
  }
}

