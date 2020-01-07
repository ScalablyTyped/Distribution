package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.googleapis.Anon_CaseSensitiveFirstStepRequired
import typings.googleapis.Anon_ComparisonTypeComparisonValue
import typings.googleapis.Anon_EventConditions
import typings.googleapis.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics goal resource.
  */
@js.native
trait Schema$Goal extends js.Object {
  /**
    * Account ID to which this goal belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Determines whether this goal is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Time this goal was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Details for the goal of the type EVENT.
    */
  var eventDetails: js.UndefOr[Anon_EventConditions] = js.native
  /**
    * Goal ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Internal ID for the web property to which this goal belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /**
    * Resource type for an Analytics goal.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Goal name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent link for a goal. Points to the view (profile) to which this goal
    * belongs.
    */
  var parentLink: js.UndefOr[Anon_Href] = js.native
  /**
    * View (Profile) ID to which this goal belongs.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Link for this goal.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Goal type. Possible values are URL_DESTINATION, VISIT_TIME_ON_SITE,
    * VISIT_NUM_PAGES, AND EVENT.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Time this goal was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Details for the goal of the type URL_DESTINATION.
    */
  var urlDestinationDetails: js.UndefOr[Anon_CaseSensitiveFirstStepRequired] = js.native
  /**
    * Goal value.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * Details for the goal of the type VISIT_NUM_PAGES.
    */
  var visitNumPagesDetails: js.UndefOr[Anon_ComparisonTypeComparisonValue] = js.native
  /**
    * Details for the goal of the type VISIT_TIME_ON_SITE.
    */
  var visitTimeOnSiteDetails: js.UndefOr[Anon_ComparisonTypeComparisonValue] = js.native
  /**
    * Web property ID to which this goal belongs. The web property ID is of the
    * form UA-XXXXX-YY.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object Schema$Goal {
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
  ): Schema$Goal = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (eventDetails != null) __obj.updateDynamic("eventDetails")(eventDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (urlDestinationDetails != null) __obj.updateDynamic("urlDestinationDetails")(urlDestinationDetails.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visitNumPagesDetails != null) __obj.updateDynamic("visitNumPagesDetails")(visitNumPagesDetails.asInstanceOf[js.Any])
    if (visitTimeOnSiteDetails != null) __obj.updateDynamic("visitTimeOnSiteDetails")(visitTimeOnSiteDetails.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Goal]
  }
}

