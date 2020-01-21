package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTreeResponse extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[Profile] = js.undefined
  var webproperty: js.UndefOr[Webproperty] = js.undefined
}

object AccountTreeResponse {
  @scala.inline
  def apply(
    account: Account = null,
    kind: String = null,
    profile: Profile = null,
    webproperty: Webproperty = null
  ): AccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (webproperty != null) __obj.updateDynamic("webproperty")(webproperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTreeResponse]
  }
}

