package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var accountPermissionIds: js.UndefOr[js.Array[String]] = js.undefined
  var accountProfile: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var activeAdsLimitTier: js.UndefOr[String] = js.undefined
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.undefined
  var countryId: js.UndefOr[String] = js.undefined
  var currencyId: js.UndefOr[String] = js.undefined
  var defaultCreativeSizeId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maximumImageSize: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined
  var reportsConfiguration: js.UndefOr[ReportsConfiguration] = js.undefined
  var shareReportsWithTwitter: js.UndefOr[Boolean] = js.undefined
  var teaserSizeLimit: js.UndefOr[String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    accountPermissionIds: js.Array[String] = null,
    accountProfile: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    activeAdsLimitTier: String = null,
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    availablePermissionIds: js.Array[String] = null,
    countryId: String = null,
    currencyId: String = null,
    defaultCreativeSizeId: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    locale: String = null,
    maximumImageSize: String = null,
    name: String = null,
    nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined,
    reportsConfiguration: ReportsConfiguration = null,
    shareReportsWithTwitter: js.UndefOr[Boolean] = js.undefined,
    teaserSizeLimit: String = null
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

