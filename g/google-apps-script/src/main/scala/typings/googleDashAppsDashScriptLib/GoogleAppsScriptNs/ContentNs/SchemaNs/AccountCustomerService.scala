package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountCustomerService extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object AccountCustomerService {
  @scala.inline
  def apply(email: java.lang.String = null, phoneNumber: java.lang.String = null, url: java.lang.String = null): AccountCustomerService = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AccountCustomerService]
  }
}

