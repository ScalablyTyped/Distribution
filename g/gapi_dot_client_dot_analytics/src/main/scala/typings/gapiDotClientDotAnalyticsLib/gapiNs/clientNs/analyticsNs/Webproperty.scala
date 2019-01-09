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

