package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertySummary extends js.Object {
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics WebPropertySummary. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Level for this web property. Possible values are STANDARD or PREMIUM. */
  var level: js.UndefOr[java.lang.String] = js.undefined
  /** Web property name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** List of profiles under this web property. */
  var profiles: js.UndefOr[js.Array[ProfileSummary]] = js.undefined
  /** Indicates whether this web property is starred or not. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** Website url for this web property. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

