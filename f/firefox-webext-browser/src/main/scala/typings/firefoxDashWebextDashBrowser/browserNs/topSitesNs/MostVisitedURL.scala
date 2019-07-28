package typings.firefoxDashWebextDashBrowser.browserNs.topSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* topSites types */
/** An object encapsulating a most visited URL, such as the URLs on the new tab page. */
trait MostVisitedURL extends js.Object {
  /** Data URL for the favicon, if available. */
  var favicon: js.UndefOr[String] = js.undefined
  /** The title of the page. */
  var title: js.UndefOr[String] = js.undefined
  /** The most visited URL. */
  var url: String
}

object MostVisitedURL {
  @scala.inline
  def apply(url: String, favicon: String = null, title: String = null): MostVisitedURL = {
    val __obj = js.Dynamic.literal(url = url)
    if (favicon != null) __obj.updateDynamic("favicon")(favicon)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MostVisitedURL]
  }
}

