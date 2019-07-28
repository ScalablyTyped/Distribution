package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClientDotAnalytics.Anon_Effective
import typings.gapiDotClientDotAnalytics.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webproperty extends js.Object {
  /** Account ID to which this web property belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Child link for this web property. Points to the list of views (profiles) for this web property. */
  var childLink: js.UndefOr[Anon_Href] = js.undefined
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
  var parentLink: js.UndefOr[Anon_Href] = js.undefined
  /** Permissions the user has for this web property. */
  var permissions: js.UndefOr[Anon_Effective] = js.undefined
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
    childLink: Anon_Href = null,
    created: String = null,
    defaultProfileId: String = null,
    id: String = null,
    industryVertical: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    level: String = null,
    name: String = null,
    parentLink: Anon_Href = null,
    permissions: Anon_Effective = null,
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

