package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertiser extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var advertiserGroupId: js.UndefOr[String] = js.undefined
  var clickThroughUrlSuffix: js.UndefOr[String] = js.undefined
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.undefined
  var defaultEmail: js.UndefOr[String] = js.undefined
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var originalFloodlightConfigurationId: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var suspended: js.UndefOr[Boolean] = js.undefined
}

object Advertiser {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserGroupId: String = null,
    clickThroughUrlSuffix: String = null,
    defaultClickThroughEventTagId: String = null,
    defaultEmail: String = null,
    floodlightConfigurationId: String = null,
    floodlightConfigurationIdDimensionValue: DimensionValue = null,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    kind: String = null,
    name: String = null,
    originalFloodlightConfigurationId: String = null,
    status: String = null,
    subaccountId: String = null,
    suspended: js.UndefOr[Boolean] = js.undefined
  ): Advertiser = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserGroupId != null) __obj.updateDynamic("advertiserGroupId")(advertiserGroupId.asInstanceOf[js.Any])
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix.asInstanceOf[js.Any])
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId.asInstanceOf[js.Any])
    if (defaultEmail != null) __obj.updateDynamic("defaultEmail")(defaultEmail.asInstanceOf[js.Any])
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId.asInstanceOf[js.Any])
    if (floodlightConfigurationIdDimensionValue != null) __obj.updateDynamic("floodlightConfigurationIdDimensionValue")(floodlightConfigurationIdDimensionValue.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalFloodlightConfigurationId != null) __obj.updateDynamic("originalFloodlightConfigurationId")(originalFloodlightConfigurationId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advertiser]
  }
}

