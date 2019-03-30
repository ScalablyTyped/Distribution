package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDeliveryDetails extends js.Object {
  var address: js.UndefOr[OrderAddress] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
}

object OrderDeliveryDetails {
  @scala.inline
  def apply(address: OrderAddress = null, phoneNumber: java.lang.String = null): OrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[OrderDeliveryDetails]
  }
}

