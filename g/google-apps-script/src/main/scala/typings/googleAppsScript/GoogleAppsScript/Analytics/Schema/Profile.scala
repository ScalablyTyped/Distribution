package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(botFilteringEnabled)) __obj.updateDynamic("botFilteringEnabled")(botFilteringEnabled.get.asInstanceOf[js.Any])
    if (childLink != null) __obj.updateDynamic("childLink")(childLink.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (defaultPage != null) __obj.updateDynamic("defaultPage")(defaultPage.asInstanceOf[js.Any])
    if (!js.isUndefined(eCommerceTracking)) __obj.updateDynamic("eCommerceTracking")(eCommerceTracking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enhancedECommerceTracking)) __obj.updateDynamic("enhancedECommerceTracking")(enhancedECommerceTracking.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripSiteSearchCategoryParameters)) __obj.updateDynamic("stripSiteSearchCategoryParameters")(stripSiteSearchCategoryParameters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripSiteSearchQueryParameters)) __obj.updateDynamic("stripSiteSearchQueryParameters")(stripSiteSearchQueryParameters.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

