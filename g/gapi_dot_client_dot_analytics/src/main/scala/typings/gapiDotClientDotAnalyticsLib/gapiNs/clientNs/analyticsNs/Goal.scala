package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Goal extends js.Object {
  /** Account ID to which this goal belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Determines whether this goal is active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Time this goal was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the goal of the type EVENT. */
  var eventDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_EventConditions] = js.undefined
  /** Goal ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for the web property to which this goal belongs. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for an Analytics goal. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Goal name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for a goal. Points to the view (profile) to which this goal belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** View (Profile) ID to which this goal belongs. */
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  /** Link for this goal. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Goal type. Possible values are URL_DESTINATION, VISIT_TIME_ON_SITE, VISIT_NUM_PAGES, AND EVENT. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Time this goal was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the goal of the type URL_DESTINATION. */
  var urlDestinationDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_CaseSensitiveFirstStepRequired] = js.undefined
  /** Goal value. */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Details for the goal of the type VISIT_NUM_PAGES. */
  var visitNumPagesDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_ComparisonTypeComparisonValue] = js.undefined
  /** Details for the goal of the type VISIT_TIME_ON_SITE. */
  var visitTimeOnSiteDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_ComparisonTypeComparisonValue] = js.undefined
  /** Web property ID to which this goal belongs. The web property ID is of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object Goal {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    created: java.lang.String = null,
    eventDetails: gapiDotClientDotAnalyticsLib.Anon_EventConditions = null,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    parentLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    profileId: java.lang.String = null,
    selfLink: java.lang.String = null,
    `type`: java.lang.String = null,
    updated: java.lang.String = null,
    urlDestinationDetails: gapiDotClientDotAnalyticsLib.Anon_CaseSensitiveFirstStepRequired = null,
    value: scala.Int | scala.Double = null,
    visitNumPagesDetails: gapiDotClientDotAnalyticsLib.Anon_ComparisonTypeComparisonValue = null,
    visitTimeOnSiteDetails: gapiDotClientDotAnalyticsLib.Anon_ComparisonTypeComparisonValue = null,
    webPropertyId: java.lang.String = null
  ): Goal = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (created != null) __obj.updateDynamic("created")(created)
    if (eventDetails != null) __obj.updateDynamic("eventDetails")(eventDetails)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (urlDestinationDetails != null) __obj.updateDynamic("urlDestinationDetails")(urlDestinationDetails)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visitNumPagesDetails != null) __obj.updateDynamic("visitNumPagesDetails")(visitNumPagesDetails)
    if (visitTimeOnSiteDetails != null) __obj.updateDynamic("visitTimeOnSiteDetails")(visitTimeOnSiteDetails)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[Goal]
  }
}

