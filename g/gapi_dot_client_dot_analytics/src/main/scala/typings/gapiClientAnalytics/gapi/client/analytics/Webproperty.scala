package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.AnonEffective
import typings.gapiClientAnalytics.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webproperty extends js.Object {
  /** Account ID to which this web property belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Child link for this web property. Points to the list of views (profiles) for this web property. */
  var childLink: js.UndefOr[AnonHref] = js.undefined
  /** Time this web property was created. */
  var created: js.UndefOr[String] = js.undefined
  /** Default view (profile) ID. */
  var defaultProfileId: js.UndefOr[String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[String] = js.undefined
  /** The industry vertical/category selected for this web property. */
  var industryVertical: js.UndefOr[String] = js.undefined
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  /** Resource type for Analytics WebProperty. */
  var kind: js.UndefOr[String] = js.undefined
  /** Level for this web property. Possible values are STANDARD or PREMIUM. */
  var level: js.UndefOr[String] = js.undefined
  /** Name of this web property. */
  var name: js.UndefOr[String] = js.undefined
  /** Parent link for this web property. Points to the account to which this web property belongs. */
  var parentLink: js.UndefOr[AnonHref] = js.undefined
  /** Permissions the user has for this web property. */
  var permissions: js.UndefOr[AnonEffective] = js.undefined
  /** View (Profile) count for this web property. */
  var profileCount: js.UndefOr[Double] = js.undefined
  /** Link for this web property. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Indicates whether this web property is starred or not. */
  var starred: js.UndefOr[Boolean] = js.undefined
  /** Time this web property was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  /** Website url for this web property. */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object Webproperty {
  @scala.inline
  def apply(
    accountId: String = null,
    childLink: AnonHref = null,
    created: String = null,
    defaultProfileId: String = null,
    id: String = null,
    industryVertical: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    level: String = null,
    name: String = null,
    parentLink: AnonHref = null,
    permissions: AnonEffective = null,
    profileCount: Int | Double = null,
    selfLink: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    updated: String = null,
    websiteUrl: String = null
  ): Webproperty = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (childLink != null) __obj.updateDynamic("childLink")(childLink.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (defaultProfileId != null) __obj.updateDynamic("defaultProfileId")(defaultProfileId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (industryVertical != null) __obj.updateDynamic("industryVertical")(industryVertical.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (profileCount != null) __obj.updateDynamic("profileCount")(profileCount.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webproperty]
  }
}

