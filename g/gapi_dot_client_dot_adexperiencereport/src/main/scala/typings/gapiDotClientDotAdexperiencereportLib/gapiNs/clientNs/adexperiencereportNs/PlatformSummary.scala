package typings
package gapiDotClientDotAdexperiencereportLib.gapiNs.clientNs.adexperiencereportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformSummary extends js.Object {
  /** The status of the site reviewed for the Better Ads Standards. */
  var betterAdsStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The date on which ad filtering begins. */
  var enforcementTime: js.UndefOr[java.lang.String] = js.undefined
  /** The ad filtering status of the site. */
  var filterStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The last time that the site changed status. */
  var lastChangeTime: js.UndefOr[java.lang.String] = js.undefined
  /** The assigned regions for the site and platform. */
  var region: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A link that leads to a full ad experience report. */
  var reportUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the site is currently under review. */
  var underReview: js.UndefOr[scala.Boolean] = js.undefined
}

