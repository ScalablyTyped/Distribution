package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudience extends js.Object {
  /** Account ID to which this remarketing audience belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The simple audience definition that will cause a user to be added to an audience. */
  var audienceDefinition: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_IncludeConditions] = js.undefined
  /** The type of audience, either SIMPLE or STATE_BASED. */
  var audienceType: js.UndefOr[java.lang.String] = js.undefined
  /** Time this remarketing audience was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** The description of this remarketing audience. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Remarketing Audience ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for the web property to which this remarketing audience belongs. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The linked ad accounts associated with this remarketing audience. A remarketing audience can have only one linkedAdAccount currently. */
  var linkedAdAccounts: js.UndefOr[js.Array[LinkedForeignAccount]] = js.undefined
  /** The views (profiles) that this remarketing audience is linked to. */
  var linkedViews: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The name of this remarketing audience. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A state based audience definition that will cause a user to be added or removed from an audience. */
  var stateBasedAudienceDefinition: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_ExcludeConditions] = js.undefined
  /** Time this remarketing audience was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this remarketing audience belongs. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

