package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderDeliveryDetails extends js.Object {
  /**
    * The delivery address
    */
  var address: js.UndefOr[Schema$OrderAddress] = js.native
  /**
    * The phone number of the person receiving the delivery.
    */
  var phoneNumber: js.UndefOr[String] = js.native
}

object Schema$OrderDeliveryDetails {
  @scala.inline
  def apply(address: Schema$OrderAddress = null, phoneNumber: String = null): Schema$OrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderDeliveryDetails]
  }
}

