package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsNotifyAuthApprovedRequest extends js.Object {
  var authAmountPretax: js.UndefOr[Price] = js.undefined
  var authAmountTax: js.UndefOr[Price] = js.undefined
}

object OrderpaymentsNotifyAuthApprovedRequest {
  @scala.inline
  def apply(authAmountPretax: Price = null, authAmountTax: Price = null): OrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    if (authAmountPretax != null) __obj.updateDynamic("authAmountPretax")(authAmountPretax)
    if (authAmountTax != null) __obj.updateDynamic("authAmountTax")(authAmountTax)
    __obj.asInstanceOf[OrderpaymentsNotifyAuthApprovedRequest]
  }
}

