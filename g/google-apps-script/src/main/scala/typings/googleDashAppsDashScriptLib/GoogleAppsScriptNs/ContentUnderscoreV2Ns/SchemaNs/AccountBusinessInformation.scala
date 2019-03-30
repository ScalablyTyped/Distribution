package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountBusinessInformation extends js.Object {
  var address: js.UndefOr[AccountAddress] = js.undefined
  var customerService: js.UndefOr[AccountCustomerService] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
}

object AccountBusinessInformation {
  @scala.inline
  def apply(
    address: AccountAddress = null,
    customerService: AccountCustomerService = null,
    phoneNumber: java.lang.String = null
  ): AccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (customerService != null) __obj.updateDynamic("customerService")(customerService)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[AccountBusinessInformation]
  }
}

