package typings.firefoxDashWebextDashBrowser.browser.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The entry type, either `url` for a normal page link, or `search` for a search shortcut. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.url
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.search
*/
trait _MostVisitedURLType extends js.Object

object _MostVisitedURLType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def search: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.search = this.cast("search")
  @scala.inline
  def url: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.url = this.cast("url")
}

