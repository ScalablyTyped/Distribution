package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountBusinessInformation extends js.Object {
  /**
    * The address of the business.
    */
  var address: js.UndefOr[Schema$AccountAddress] = js.native
  /**
    * The customer service information of the business.
    */
  var customerService: js.UndefOr[Schema$AccountCustomerService] = js.native
  /**
    * The phone number of the business.
    */
  var phoneNumber: js.UndefOr[String] = js.native
}

object Schema$AccountBusinessInformation {
  @scala.inline
  def apply(
    address: Schema$AccountAddress = null,
    customerService: Schema$AccountCustomerService = null,
    phoneNumber: String = null
  ): Schema$AccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (customerService != null) __obj.updateDynamic("customerService")(customerService.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountBusinessInformation]
  }
}

