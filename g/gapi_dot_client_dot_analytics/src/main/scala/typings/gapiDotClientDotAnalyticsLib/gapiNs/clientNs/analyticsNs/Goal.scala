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

