package typings
package gapiDotClientDotAdexperiencereportLib.gapiNs.clientNs.adexperiencereportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteSummaryResponse extends js.Object {
  /** Summary for the desktop review of the site. */
  var desktopSummary: js.UndefOr[PlatformSummary] = js.undefined
  /** Summary for the mobile review of the site. */
  var mobileSummary: js.UndefOr[PlatformSummary] = js.undefined
  /** The name of the site reviewed. */
  var reviewedSite: js.UndefOr[java.lang.String] = js.undefined
}

