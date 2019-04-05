package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertiser extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserGroupId: js.UndefOr[java.lang.String] = js.undefined
  var clickThroughUrlSuffix: js.UndefOr[java.lang.String] = js.undefined
  var defaultClickThroughEventTagId: js.UndefOr[java.lang.String] = js.undefined
  var defaultEmail: js.UndefOr[java.lang.String] = js.undefined
  var floodlightConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var originalFloodlightConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var suspended: js.UndefOr[scala.Boolean] = js.undefined
}

object Advertiser {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserGroupId: java.lang.String = null,
    clickThroughUrlSuffix: java.lang.String = null,
    defaultClickThroughEventTagId: java.lang.String = null,
    defaultEmail: java.lang.String = null,
    floodlightConfigurationId: java.lang.String = null,
    floodlightConfigurationIdDimensionValue: DimensionValue = null,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    originalFloodlightConfigurationId: java.lang.String = null,
    status: java.lang.String = null,
    subaccountId: java.lang.String = null,
    suspended: js.UndefOr[scala.Boolean] = js.undefined
  ): Advertiser = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserGroupId != null) __obj.updateDynamic("advertiserGroupId")(advertiserGroupId)
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix)
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId)
    if (defaultEmail != null) __obj.updateDynamic("defaultEmail")(defaultEmail)
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId)
    if (floodlightConfigurationIdDimensionValue != null) __obj.updateDynamic("floodlightConfigurationIdDimensionValue")(floodlightConfigurationIdDimensionValue)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalFloodlightConfigurationId != null) __obj.updateDynamic("originalFloodlightConfigurationId")(originalFloodlightConfigurationId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended)
    __obj.asInstanceOf[Advertiser]
  }
}

