package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.AnonEffective
import typings.gapiClientAnalytics.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Indicates whether bot filtering is enabled for this view (profile). */
  var botFilteringEnabled: js.UndefOr[Boolean] = js.undefined
  /** Child link for this view (profile). Points to the list of goals for this view (profile). */
  var childLink: js.UndefOr[AnonHref] = js.undefined
  /** Time this view (profile) was created. */
  var created: js.UndefOr[String] = js.undefined
  /**
    * The currency type associated with this view (profile), defaults to USD. The supported values are:
    * USD, JPY, EUR, GBP, AUD, KRW, BRL, CNY, DKK, RUB, SEK, NOK, PLN, TRY, TWD, HKD, THB, IDR, ARS, MXN, VND, PHP, INR, CHF, CAD, CZK, NZD, HUF, BGN, LTL,
    * ZAR, UAH, AED, BOB, CLP, COP, EGP, HRK, ILS, MAD, MYR, PEN, PKR, RON, RSD, SAR, SGD, VEF, LVL
    */
  var currency: js.UndefOr[String] = js.undefined
  /** Default page for this view (profile). */
  var defaultPage: js.UndefOr[String] = js.undefined
  /** Indicates whether ecommerce tracking is enabled for this view (profile). */
  var eCommerceTracking: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether enhanced ecommerce tracking is enabled for this view (profile). This property can only be enabled if ecommerce tracking is enabled. */
  var enhancedECommerceTracking: js.UndefOr[Boolean] = js.undefined
  /** The query parameters that are excluded from this view (profile). */
  var excludeQueryParameters: js.UndefOr[String] = js.undefined
  /** View (Profile) ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  /** Resource type for Analytics view (profile). */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this view (profile). */
  var name: js.UndefOr[String] = js.undefined
  /** Parent link for this view (profile). Points to the web property to which this view (profile) belongs. */
  var parentLink: js.UndefOr[AnonHref] = js.undefined
  /** Permissions the user has for this view (profile). */
  var permissions: js.UndefOr[AnonEffective] = js.undefined
  /** Link for this view (profile). */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Site search category parameters for this view (profile). */
  var siteSearchCategoryParameters: js.UndefOr[String] = js.undefined
  /** The site search query parameters for this view (profile). */
  var siteSearchQueryParameters: js.UndefOr[String] = js.undefined
  /** Indicates whether this view (profile) is starred or not. */
  var starred: js.UndefOr[Boolean] = js.undefined
  /** Whether or not Analytics will strip search category parameters from the URLs in your reports. */
  var stripSiteSearchCategoryParameters: js.UndefOr[Boolean] = js.undefined
  /** Whether or not Analytics will strip search query parameters from the URLs in your reports. */
  var stripSiteSearchQueryParameters: js.UndefOr[Boolean] = js.undefined
  /** Time zone for which this view (profile) has been configured. Time zones are identified by strings from the TZ database. */
  var timezone: js.UndefOr[String] = js.undefined
  /** View (Profile) type. Supported types: WEB or APP. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Time this view (profile) was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[String] = js.undefined
  /** Website URL for this view (profile). */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    accountId: String = null,
    botFilteringEnabled: js.UndefOr[Boolean] = js.undefined,
    childLink: AnonHref = null,
    created: String = null,
    currency: String = null,
    defaultPage: String = null,
    eCommerceTracking: js.UndefOr[Boolean] = js.undefined,
    enhancedECommerceTracking: js.UndefOr[Boolean] = js.undefined,
    excludeQueryParameters: String = null,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    name: String = null,
    parentLink: AnonHref = null,
    permissions: AnonEffective = null,
    selfLink: String = null,
    siteSearchCategoryParameters: String = null,
    siteSearchQueryParameters: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    stripSiteSearchCategoryParameters: js.UndefOr[Boolean] = js.undefined,
    stripSiteSearchQueryParameters: js.UndefOr[Boolean] = js.undefined,
    timezone: String = null,
    `type`: String = null,
    updated: String = null,
    webPropertyId: String = null,
    websiteUrl: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(botFilteringEnabled)) __obj.updateDynamic("botFilteringEnabled")(botFilteringEnabled.asInstanceOf[js.Any])
    if (childLink != null) __obj.updateDynamic("childLink")(childLink.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (defaultPage != null) __obj.updateDynamic("defaultPage")(defaultPage.asInstanceOf[js.Any])
    if (!js.isUndefined(eCommerceTracking)) __obj.updateDynamic("eCommerceTracking")(eCommerceTracking.asInstanceOf[js.Any])
    if (!js.isUndefined(enhancedECommerceTracking)) __obj.updateDynamic("enhancedECommerceTracking")(enhancedECommerceTracking.asInstanceOf[js.Any])
    if (excludeQueryParameters != null) __obj.updateDynamic("excludeQueryParameters")(excludeQueryParameters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (siteSearchCategoryParameters != null) __obj.updateDynamic("siteSearchCategoryParameters")(siteSearchCategoryParameters.asInstanceOf[js.Any])
    if (siteSearchQueryParameters != null) __obj.updateDynamic("siteSearchQueryParameters")(siteSearchQueryParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (!js.isUndefined(stripSiteSearchCategoryParameters)) __obj.updateDynamic("stripSiteSearchCategoryParameters")(stripSiteSearchCategoryParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(stripSiteSearchQueryParameters)) __obj.updateDynamic("stripSiteSearchQueryParameters")(stripSiteSearchQueryParameters.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

