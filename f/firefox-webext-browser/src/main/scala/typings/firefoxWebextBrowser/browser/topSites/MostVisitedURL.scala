package typings.firefoxWebextBrowser.browser.topSites

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
  /** The entry type, either `url` for a normal page link, or `search` for a search shortcut. */
  var `type`: js.UndefOr[MostVisitedURLType] = js.undefined
  /** The most visited URL. */
  var url: String
}

object MostVisitedURL {
  @scala.inline
  def apply(url: String, favicon: String = null, title: String = null, `type`: MostVisitedURLType = null): MostVisitedURL = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MostVisitedURL]
  }
}

