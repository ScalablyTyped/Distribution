package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfDataProfileInfo extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  var profileName: js.UndefOr[java.lang.String] = js.undefined
  var tableId: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object McfDataProfileInfo {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    profileId: java.lang.String = null,
    profileName: java.lang.String = null,
    tableId: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): McfDataProfileInfo = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (profileName != null) __obj.updateDynamic("profileName")(profileName)
    if (tableId != null) __obj.updateDynamic("tableId")(tableId)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[McfDataProfileInfo]
  }
}

