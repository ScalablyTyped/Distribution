package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedForeignAccount extends js.Object {
  /** Account ID to which this linked foreign account belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Boolean indicating whether this is eligible for search. */
  var eligibleForSearch: js.UndefOr[Boolean] = js.undefined
  /** Entity ad account link ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Internal ID for the web property to which this linked foreign account belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  /** Resource type for linked foreign account. */
  var kind: js.UndefOr[String] = js.undefined
  /** The foreign account ID. For example the an AdWords `linkedAccountId` has the following format XXX-XXX-XXXX. */
  var linkedAccountId: js.UndefOr[String] = js.undefined
  /** Remarketing audience ID to which this linked foreign account belongs. */
  var remarketingAudienceId: js.UndefOr[String] = js.undefined
  /** The status of this foreign account link. */
  var status: js.UndefOr[String] = js.undefined
  /** The type of the foreign account. For example, `ADWORDS_LINKS`, `DBM_LINKS`, `MCC_LINKS` or `OPTIMIZE`. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this linked foreign account belongs. */
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

