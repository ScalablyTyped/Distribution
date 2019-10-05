package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTreeRequest extends js.Object {
  var accountName: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var profileName: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var webpropertyName: js.UndefOr[String] = js.undefined
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object AccountTreeRequest {
  @scala.inline
  def apply(
    accountName: String = null,
    kind: String = null,
    profileName: String = null,
    timezone: String = null,
    webpropertyName: String = null,
    websiteUrl: String = null
  ): AccountTreeRequest = {
    val __obj = js.Dynamic.literal()
    if (accountName != null) __obj.updateDynamic("accountName")(accountName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (profileName != null) __obj.updateDynamic("profileName")(profileName)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (webpropertyName != null) __obj.updateDynamic("webpropertyName")(webpropertyName)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[AccountTreeRequest]
  }
}

