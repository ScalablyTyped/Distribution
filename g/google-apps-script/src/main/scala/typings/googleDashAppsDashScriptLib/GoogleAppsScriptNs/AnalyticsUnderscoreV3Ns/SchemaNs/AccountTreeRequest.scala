package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTreeRequest extends js.Object {
  var accountName: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var profileName: js.UndefOr[java.lang.String] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var webpropertyName: js.UndefOr[java.lang.String] = js.undefined
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object AccountTreeRequest {
  @scala.inline
  def apply(
    accountName: java.lang.String = null,
    kind: java.lang.String = null,
    profileName: java.lang.String = null,
    timezone: java.lang.String = null,
    webpropertyName: java.lang.String = null,
    websiteUrl: java.lang.String = null
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

