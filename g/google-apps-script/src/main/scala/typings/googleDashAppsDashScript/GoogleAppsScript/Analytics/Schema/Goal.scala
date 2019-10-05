package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Goal extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var eventDetails: js.UndefOr[GoalEventDetails] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentLink: js.UndefOr[GoalParentLink] = js.undefined
  var profileId: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var urlDestinationDetails: js.UndefOr[GoalUrlDestinationDetails] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var visitNumPagesDetails: js.UndefOr[GoalVisitNumPagesDetails] = js.undefined
  var visitTimeOnSiteDetails: js.UndefOr[GoalVisitTimeOnSiteDetails] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object Goal {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    created: String = null,
    eventDetails: GoalEventDetails = null,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    name: String = null,
    parentLink: GoalParentLink = null,
    profileId: String = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null,
    urlDestinationDetails: GoalUrlDestinationDetails = null,
    value: Int | Double = null,
    visitNumPagesDetails: GoalVisitNumPagesDetails = null,
    visitTimeOnSiteDetails: GoalVisitTimeOnSiteDetails = null,
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

