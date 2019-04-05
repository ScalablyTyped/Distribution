package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webproperty extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var childLink: js.UndefOr[WebpropertyChildLink] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var dataRetentionResetOnNewActivity: js.UndefOr[scala.Boolean] = js.undefined
  var dataRetentionTtl: js.UndefOr[java.lang.String] = js.undefined
  var defaultProfileId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var industryVertical: js.UndefOr[java.lang.String] = js.undefined
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parentLink: js.UndefOr[WebpropertyParentLink] = js.undefined
  var permissions: js.UndefOr[WebpropertyPermissions] = js.undefined
  var profileCount: js.UndefOr[scala.Double] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Webproperty {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    childLink: WebpropertyChildLink = null,
    created: java.lang.String = null,
    dataRetentionResetOnNewActivity: js.UndefOr[scala.Boolean] = js.undefined,
    dataRetentionTtl: java.lang.String = null,
    defaultProfileId: java.lang.String = null,
    id: java.lang.String = null,
    industryVertical: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    level: java.lang.String = null,
    name: java.lang.String = null,
    parentLink: WebpropertyParentLink = null,
    permissions: WebpropertyPermissions = null,
    profileCount: scala.Int | scala.Double = null,
    selfLink: java.lang.String = null,
    starred: js.UndefOr[scala.Boolean] = js.undefined,
    updated: java.lang.String = null,
    websiteUrl: java.lang.String = null
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

