package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webproperty extends js.Object {
  /** Account ID to which this web property belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Child link for this web property. Points to the list of views (profiles) for this web property. */
  var childLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Time this web property was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Default view (profile) ID. */
  var defaultProfileId: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The industry vertical/category selected for this web property. */
  var industryVertical: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics WebProperty. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Level for this web property. Possible values are STANDARD or PREMIUM. */
  var level: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this web property. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for this web property. Points to the account to which this web property belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Permissions the user has for this web property. */
  var permissions: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Effective] = js.undefined
  /** View (Profile) count for this web property. */
  var profileCount: js.UndefOr[scala.Double] = js.undefined
  /** Link for this web property. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether this web property is starred or not. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** Time this web property was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Website url for this web property. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Webproperty {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    childLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    created: java.lang.String = null,
    defaultProfileId: java.lang.String = null,
    id: java.lang.String = null,
    industryVertical: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    level: java.lang.String = null,
    name: java.lang.String = null,
    parentLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    permissions: gapiDotClientDotAnalyticsLib.Anon_Effective = null,
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

