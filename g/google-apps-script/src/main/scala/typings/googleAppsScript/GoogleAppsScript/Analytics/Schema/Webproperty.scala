package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

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
    profileCount: js.UndefOr[Double] = js.undefined,
    selfLink: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    updated: String = null,
    websiteUrl: String = null
  ): Webproperty = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (childLink != null) __obj.updateDynamic("childLink")(childLink.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (!js.isUndefined(dataRetentionResetOnNewActivity)) __obj.updateDynamic("dataRetentionResetOnNewActivity")(dataRetentionResetOnNewActivity.get.asInstanceOf[js.Any])
    if (dataRetentionTtl != null) __obj.updateDynamic("dataRetentionTtl")(dataRetentionTtl.asInstanceOf[js.Any])
    if (defaultProfileId != null) __obj.updateDynamic("defaultProfileId")(defaultProfileId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (industryVertical != null) __obj.updateDynamic("industryVertical")(industryVertical.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (!js.isUndefined(profileCount)) __obj.updateDynamic("profileCount")(profileCount.get.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.get.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webproperty]
  }
}

