package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeBlocked extends js.Object {
  /** Include sites that the user has blocked from appearing on the Firefox new tab. */
  var includeBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Include sites favicon if available. */
  var includeFavicon: js.UndefOr[scala.Boolean] = js.undefined
  /** The number of top sites to return, defaults to the value used by Firefox */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** Limit the result to a single top site link per domain */
  var onePerDomain: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated Please use the other options to tune the results received from topSites. */
  var providers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

