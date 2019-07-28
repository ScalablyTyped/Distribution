package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClientDotAnalytics.Anon_CaseSensitiveFirstStepRequired
import typings.gapiDotClientDotAnalytics.Anon_ComparisonTypeComparisonValue
import typings.gapiDotClientDotAnalytics.Anon_EventConditions
import typings.gapiDotClientDotAnalytics.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Goal extends js.Object {
  /** Account ID to which this goal belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Determines whether this goal is active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Time this goal was created. */
  var created: js.UndefOr[String] = js.undefined
  /** Details for the goal of the type EVENT. */
  var eventDetails: js.UndefOr[Anon_EventConditions] = js.undefined
  /** Goal ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Internal ID for the web property to which this goal belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  /** Resource type for an Analytics goal. */
  var kind: js.UndefOr[String] = js.undefined
  /** Goal name. */
  var name: js.UndefOr[String] = js.undefined
  /** Parent link for a goal. Points to the view (profile) to which this goal belongs. */
  var parentLink: js.UndefOr[Anon_Href] = js.undefined
  /** View (Profile) ID to which this goal belongs. */
  var profileId: js.UndefOr[String] = js.undefined
  /** Link for this goal. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Goal type. Possible values are URL_DESTINATION, VISIT_TIME_ON_SITE, VISIT_NUM_PAGES, AND EVENT. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Time this goal was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  /** Details for the goal of the type URL_DESTINATION. */
  var urlDestinationDetails: js.UndefOr[Anon_CaseSensitiveFirstStepRequired] = js.undefined
  /** Goal value. */
  var value: js.UndefOr[Double] = js.undefined
  /** Details for the goal of the type VISIT_NUM_PAGES. */
  var visitNumPagesDetails: js.UndefOr[Anon_ComparisonTypeComparisonValue] = js.undefined
  /** Details for the goal of the type VISIT_TIME_ON_SITE. */
  var visitTimeOnSiteDetails: js.UndefOr[Anon_ComparisonTypeComparisonValue] = js.undefined
  /** Web property ID to which this goal belongs. The web property ID is of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object Goal {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    created: String = null,
    eventDetails: Anon_EventConditions = null,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    name: String = null,
    parentLink: Anon_Href = null,
    profileId: String = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null,
    urlDestinationDetails: Anon_CaseSensitiveFirstStepRequired = null,
    value: Int | Double = null,
    visitNumPagesDetails: Anon_ComparisonTypeComparisonValue = null,
    visitTimeOnSiteDetails: Anon_ComparisonTypeComparisonValue = null,
    webPropertyId: String = null
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

