package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webproperty extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var childLink: js.UndefOr[WebpropertyChildLink] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var dataRetentionResetOnNewActivity: js.UndefOr[Boolean] = js.undefined
  var dataRetentionTtl: js.UndefOr[String] = js.undefined
  var defaultProfileId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var industryVertical: js.UndefOr[String] = js.undefined
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentLink: js.UndefOr[WebpropertyParentLink] = js.undefined
  var permissions: js.UndefOr[WebpropertyPermissions] = js.undefined
  var profileCount: js.UndefOr[Double] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var starred: js.UndefOr[Boolean] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object Webproperty {
  @scala.inline
  def apply(
    accountId: String = null,
    childLink: WebpropertyChildLink = null,
    created: String = null,
    dataRetentionResetOnNewActivity: js.UndefOr[Boolean] = js.undefined,
    dataRetentionTtl: String = null,
    defaultProfileId: String = null,
    id: String = null,
    industryVertical: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    level: String = null,
    name: String = null,
    parentLink: WebpropertyParentLink = null,
    permissions: WebpropertyPermissions = null,
    profileCount: Int | Double = null,
    selfLink: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    updated: String = null,
    websiteUrl: String = null
  ): Webproperty = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (childLink != null) __obj.updateDynamic("childLink")(childLink)
    if (created != null) __obj.updateDynamic("created")(created)
    if (!js.isUndefined(dataRetentionResetOnNewActivity)) __obj.updateDynamic("dataRetentionResetOnNewActivity")(dataRetentionResetOnNewActivity)
    if (dataRetentionTtl != null) __obj.updateDynamic("dataRetentionTtl")(dataRetentionTtl)
    if (defaultProfileId != null) __obj.updateDynamic("defaultProfileId")(defaultProfileId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (industryVertical != null) __obj.updateDynamic("industryVertical")(industryVertical)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (level != null) __obj.updateDynamic("level")(level)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (profileCount != null) __obj.updateDynamic("profileCount")(profileCount.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[Webproperty]
  }
}

