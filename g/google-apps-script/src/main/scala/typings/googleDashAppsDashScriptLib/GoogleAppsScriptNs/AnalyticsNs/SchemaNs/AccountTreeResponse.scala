package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTreeResponse extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[Profile] = js.undefined
  var webproperty: js.UndefOr[Webproperty] = js.undefined
}

object AccountTreeResponse {
  @scala.inline
  def apply(
    account: Account = null,
    kind: java.lang.String = null,
    profile: Profile = null,
    webproperty: Webproperty = null
  ): AccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (webproperty != null) __obj.updateDynamic("webproperty")(webproperty)
    __obj.asInstanceOf[AccountTreeResponse]
  }
}

