package typings.firefoxWebextBrowser.browser.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The entry type, either `url` for a normal page link, or `search` for a search shortcut. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
*/
trait MostVisitedURLType extends js.Object

object MostVisitedURLType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def search: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = this.cast("search")
  @scala.inline
  def url: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

