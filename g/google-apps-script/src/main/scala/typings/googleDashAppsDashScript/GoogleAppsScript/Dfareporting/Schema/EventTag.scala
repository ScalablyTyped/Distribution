package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTag extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var campaignId: js.UndefOr[String] = js.undefined
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var enabledByDefault: js.UndefOr[Boolean] = js.undefined
  var excludeFromAdxRequests: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var siteFilterType: js.UndefOr[String] = js.undefined
  var siteIds: js.UndefOr[js.Array[String]] = js.undefined
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urlEscapeLevels: js.UndefOr[Double] = js.undefined
}

object EventTag {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    campaignId: String = null,
    campaignIdDimensionValue: DimensionValue = null,
    enabledByDefault: js.UndefOr[Boolean] = js.undefined,
    excludeFromAdxRequests: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    siteFilterType: String = null,
    siteIds: js.Array[String] = null,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    status: String = null,
    subaccountId: String = null,
    `type`: String = null,
    url: String = null,
    urlEscapeLevels: Int | Double = null
  ): EventTag = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledByDefault)) __obj.updateDynamic("enabledByDefault")(enabledByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeFromAdxRequests)) __obj.updateDynamic("excludeFromAdxRequests")(excludeFromAdxRequests.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (siteFilterType != null) __obj.updateDynamic("siteFilterType")(siteFilterType.asInstanceOf[js.Any])
    if (siteIds != null) __obj.updateDynamic("siteIds")(siteIds.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlEscapeLevels != null) __obj.updateDynamic("urlEscapeLevels")(urlEscapeLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTag]
  }
}

