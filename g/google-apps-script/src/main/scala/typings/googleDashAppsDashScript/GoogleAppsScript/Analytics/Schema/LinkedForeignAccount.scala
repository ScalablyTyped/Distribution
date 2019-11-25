package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedForeignAccount extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var eligibleForSearch: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var linkedAccountId: js.UndefOr[String] = js.undefined
  var remarketingAudienceId: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object LinkedForeignAccount {
  @scala.inline
  def apply(
    accountId: String = null,
    eligibleForSearch: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    linkedAccountId: String = null,
    remarketingAudienceId: String = null,
    status: String = null,
    `type`: String = null,
    webPropertyId: String = null
  ): LinkedForeignAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(eligibleForSearch)) __obj.updateDynamic("eligibleForSearch")(eligibleForSearch.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (linkedAccountId != null) __obj.updateDynamic("linkedAccountId")(linkedAccountId.asInstanceOf[js.Any])
    if (remarketingAudienceId != null) __obj.updateDynamic("remarketingAudienceId")(remarketingAudienceId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedForeignAccount]
  }
}

