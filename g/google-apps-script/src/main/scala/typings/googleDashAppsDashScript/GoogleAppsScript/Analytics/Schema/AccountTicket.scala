package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTicket extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[Profile] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var webproperty: js.UndefOr[Webproperty] = js.undefined
}

object AccountTicket {
  @scala.inline
  def apply(
    account: Account = null,
    id: String = null,
    kind: String = null,
    profile: Profile = null,
    redirectUri: String = null,
    webproperty: Webproperty = null
  ): AccountTicket = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (webproperty != null) __obj.updateDynamic("webproperty")(webproperty)
    __obj.asInstanceOf[AccountTicket]
  }
}

