package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether bot filtering is enabled for this view (profile). */
  var botFilteringEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Child link for this view (profile). Points to the list of goals for this view (profile). */
  var childLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Time this view (profile) was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The currency type associated with this view (profile), defaults to USD. The supported values are:
    * USD, JPY, EUR, GBP, AUD, KRW, BRL, CNY, DKK, RUB, SEK, NOK, PLN, TRY, TWD, HKD, THB, IDR, ARS, MXN, VND, PHP, INR, CHF, CAD, CZK, NZD, HUF, BGN, LTL,
    * ZAR, UAH, AED, BOB, CLP, COP, EGP, HRK, ILS, MAD, MYR, PEN, PKR, RON, RSD, SAR, SGD, VEF, LVL
    */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** Default page for this view (profile). */
  var defaultPage: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether ecommerce tracking is enabled for this view (profile). */
  var eCommerceTracking: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether enhanced ecommerce tracking is enabled for this view (profile). This property can only be enabled if ecommerce tracking is enabled. */
  var enhancedECommerceTracking: js.UndefOr[scala.Boolean] = js.undefined
  /** The query parameters that are excluded from this view (profile). */
  var excludeQueryParameters: js.UndefOr[java.lang.String] = js.undefined
  /** View (Profile) ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics view (profile). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this view (profile). */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for this view (profile). Points to the web property to which this view (profile) belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Permissions the user has for this view (profile). */
  var permissions: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Effective] = js.undefined
  /** Link for this view (profile). */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Site search category parameters for this view (profile). */
  var siteSearchCategoryParameters: js.UndefOr[java.lang.String] = js.undefined
  /** The site search query parameters for this view (profile). */
  var siteSearchQueryParameters: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether this view (profile) is starred or not. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not Analytics will strip search category parameters from the URLs in your reports. */
  var stripSiteSearchCategoryParameters: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not Analytics will strip search query parameters from the URLs in your reports. */
  var stripSiteSearchQueryParameters: js.UndefOr[scala.Boolean] = js.undefined
  /** Time zone for which this view (profile) has been configured. Time zones are identified by strings from the TZ database. */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /** View (Profile) type. Supported types: WEB or APP. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Time this view (profile) was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Website URL for this view (profile). */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    botFilteringEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    childLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    created: java.lang.String = null,
    currency: java.lang.String = null,
    defaultPage: java.lang.String = null,
    eCommerceTracking: js.UndefOr[scala.Boolean] = js.undefined,
    enhancedECommerceTracking: js.UndefOr[scala.Boolean] = js.undefined,
    excludeQueryParameters: java.lang.String = null,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    parentLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    permissions: gapiDotClientDotAnalyticsLib.Anon_Effective = null,
    selfLink: java.lang.String = null,
    siteSearchCategoryParameters: java.lang.String = null,
    siteSearchQueryParameters: java.lang.String = null,
    starred: js.UndefOr[scala.Boolean] = js.undefined,
    stripSiteSearchCategoryParameters: js.UndefOr[scala.Boolean] = js.undefined,
    stripSiteSearchQueryParameters: js.UndefOr[scala.Boolean] = js.undefined,
    timezone: java.lang.String = null,
    `type`: java.lang.String = null,
    updated: java.lang.String = null,
    webPropertyId: java.lang.String = null,
    websiteUrl: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(botFilteringEnabled)) __obj.updateDynamic("botFilteringEnabled")(botFilteringEnabled)
    if (childLink != null) __obj.updateDynamic("childLink")(childLink)
    if (created != null) __obj.updateDynamic("created")(created)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (defaultPage != null) __obj.updateDynamic("defaultPage")(defaultPage)
    if (!js.isUndefined(eCommerceTracking)) __obj.updateDynamic("eCommerceTracking")(eCommerceTracking)
    if (!js.isUndefined(enhancedECommerceTracking)) __obj.updateDynamic("enhancedECommerceTracking")(enhancedECommerceTracking)
    if (excludeQueryParameters != null) __obj.updateDynamic("excludeQueryParameters")(excludeQueryParameters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (siteSearchCategoryParameters != null) __obj.updateDynamic("siteSearchCategoryParameters")(siteSearchCategoryParameters)
    if (siteSearchQueryParameters != null) __obj.updateDynamic("siteSearchQueryParameters")(siteSearchQueryParameters)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (!js.isUndefined(stripSiteSearchCategoryParameters)) __obj.updateDynamic("stripSiteSearchCategoryParameters")(stripSiteSearchCategoryParameters)
    if (!js.isUndefined(stripSiteSearchQueryParameters)) __obj.updateDynamic("stripSiteSearchQueryParameters")(stripSiteSearchQueryParameters)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[Profile]
  }
}

