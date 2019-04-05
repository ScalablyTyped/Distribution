package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedForeignAccount extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var eligibleForSearch: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var linkedAccountId: js.UndefOr[java.lang.String] = js.undefined
  var remarketingAudienceId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object LinkedForeignAccount {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    eligibleForSearch: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    linkedAccountId: java.lang.String = null,
    remarketingAudienceId: java.lang.String = null,
    status: java.lang.String = null,
    `type`: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): LinkedForeignAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(eligibleForSearch)) __obj.updateDynamic("eligibleForSearch")(eligibleForSearch)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (linkedAccountId != null) __obj.updateDynamic("linkedAccountId")(linkedAccountId)
    if (remarketingAudienceId != null) __obj.updateDynamic("remarketingAudienceId")(remarketingAudienceId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[LinkedForeignAccount]
  }
}

