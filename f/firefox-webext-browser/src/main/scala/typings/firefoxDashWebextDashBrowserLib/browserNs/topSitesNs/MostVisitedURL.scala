package typings
package firefoxDashWebextDashBrowserLib.browserNs.topSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* topSites types */
/** An object encapsulating a most visited URL, such as the URLs on the new tab page. */

trait MostVisitedURL extends js.Object {
  /** Data URL for the favicon, if available. */
  var favicon: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the page. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The most visited URL. */
  var url: java.lang.String
}

