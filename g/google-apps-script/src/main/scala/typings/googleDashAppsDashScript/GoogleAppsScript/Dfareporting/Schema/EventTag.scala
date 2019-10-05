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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue)
    if (!js.isUndefined(enabledByDefault)) __obj.updateDynamic("enabledByDefault")(enabledByDefault)
    if (!js.isUndefined(excludeFromAdxRequests)) __obj.updateDynamic("excludeFromAdxRequests")(excludeFromAdxRequests)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (siteFilterType != null) __obj.updateDynamic("siteFilterType")(siteFilterType)
    if (siteIds != null) __obj.updateDynamic("siteIds")(siteIds)
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urlEscapeLevels != null) __obj.updateDynamic("urlEscapeLevels")(urlEscapeLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTag]
  }
}

