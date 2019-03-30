package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var accountPermissionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var accountProfile: js.UndefOr[java.lang.String] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var activeAdsLimitTier: js.UndefOr[java.lang.String] = js.undefined
  var activeViewOptOut: js.UndefOr[scala.Boolean] = js.undefined
  var availablePermissionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var countryId: js.UndefOr[java.lang.String] = js.undefined
  var currencyId: js.UndefOr[java.lang.String] = js.undefined
  var defaultCreativeSizeId: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maximumImageSize: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nielsenOcrEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var reportsConfiguration: js.UndefOr[ReportsConfiguration] = js.undefined
  var shareReportsWithTwitter: js.UndefOr[scala.Boolean] = js.undefined
  var teaserSizeLimit: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    accountPermissionIds: js.Array[java.lang.String] = null,
    accountProfile: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    activeAdsLimitTier: java.lang.String = null,
    activeViewOptOut: js.UndefOr[scala.Boolean] = js.undefined,
    availablePermissionIds: js.Array[java.lang.String] = null,
    countryId: java.lang.String = null,
    currencyId: java.lang.String = null,
    defaultCreativeSizeId: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    locale: java.lang.String = null,
    maximumImageSize: java.lang.String = null,
    name: java.lang.String = null,
    nielsenOcrEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    reportsConfiguration: ReportsConfiguration = null,
    shareReportsWithTwitter: js.UndefOr[scala.Boolean] = js.undefined,
    teaserSizeLimit: java.lang.String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (accountPermissionIds != null) __obj.updateDynamic("accountPermissionIds")(accountPermissionIds)
    if (accountProfile != null) __obj.updateDynamic("accountProfile")(accountProfile)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (activeAdsLimitTier != null) __obj.updateDynamic("activeAdsLimitTier")(activeAdsLimitTier)
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut)
    if (availablePermissionIds != null) __obj.updateDynamic("availablePermissionIds")(availablePermissionIds)
    if (countryId != null) __obj.updateDynamic("countryId")(countryId)
    if (currencyId != null) __obj.updateDynamic("currencyId")(currencyId)
    if (defaultCreativeSizeId != null) __obj.updateDynamic("defaultCreativeSizeId")(defaultCreativeSizeId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maximumImageSize != null) __obj.updateDynamic("maximumImageSize")(maximumImageSize)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nielsenOcrEnabled)) __obj.updateDynamic("nielsenOcrEnabled")(nielsenOcrEnabled)
    if (reportsConfiguration != null) __obj.updateDynamic("reportsConfiguration")(reportsConfiguration)
    if (!js.isUndefined(shareReportsWithTwitter)) __obj.updateDynamic("shareReportsWithTwitter")(shareReportsWithTwitter)
    if (teaserSizeLimit != null) __obj.updateDynamic("teaserSizeLimit")(teaserSizeLimit)
    __obj.asInstanceOf[Account]
  }
}

