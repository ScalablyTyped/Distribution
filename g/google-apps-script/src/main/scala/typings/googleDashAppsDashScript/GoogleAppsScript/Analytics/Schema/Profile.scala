package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var botFilteringEnabled: js.UndefOr[Boolean] = js.undefined
  var childLink: js.UndefOr[ProfileChildLink] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var defaultPage: js.UndefOr[String] = js.undefined
  var eCommerceTracking: js.UndefOr[Boolean] = js.undefined
  var enhancedECommerceTracking: js.UndefOr[Boolean] = js.undefined
  var excludeQueryParameters: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentLink: js.UndefOr[ProfileParentLink] = js.undefined
  var permissions: js.UndefOr[ProfilePermissions] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var siteSearchCategoryParameters: js.UndefOr[String] = js.undefined
  var siteSearchQueryParameters: js.UndefOr[String] = js.undefined
  var starred: js.UndefOr[Boolean] = js.undefined
  var stripSiteSearchCategoryParameters: js.UndefOr[Boolean] = js.undefined
  var stripSiteSearchQueryParameters: js.UndefOr[Boolean] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    accountId: String = null,
    botFilteringEnabled: js.UndefOr[Boolean] = js.undefined,
    childLink: ProfileChildLink = null,
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
    parentLink: ProfileParentLink = null,
    permissions: ProfilePermissions = null,
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

