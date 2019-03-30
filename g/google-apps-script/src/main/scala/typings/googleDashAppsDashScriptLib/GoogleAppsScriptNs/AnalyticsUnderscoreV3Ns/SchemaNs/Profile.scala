package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var botFilteringEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var childLink: js.UndefOr[ProfileChildLink] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var defaultPage: js.UndefOr[java.lang.String] = js.undefined
  var eCommerceTracking: js.UndefOr[scala.Boolean] = js.undefined
  var enhancedECommerceTracking: js.UndefOr[scala.Boolean] = js.undefined
  var excludeQueryParameters: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parentLink: js.UndefOr[ProfileParentLink] = js.undefined
  var permissions: js.UndefOr[ProfilePermissions] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var siteSearchCategoryParameters: js.UndefOr[java.lang.String] = js.undefined
  var siteSearchQueryParameters: js.UndefOr[java.lang.String] = js.undefined
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  var stripSiteSearchCategoryParameters: js.UndefOr[scala.Boolean] = js.undefined
  var stripSiteSearchQueryParameters: js.UndefOr[scala.Boolean] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    botFilteringEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    childLink: ProfileChildLink = null,
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
    parentLink: ProfileParentLink = null,
    permissions: ProfilePermissions = null,
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

