package typings.firefoxDashWebextDashBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible types of results. `remote_tab`: A synced tab from another device. `search`: A search suggestion from a
  * search engine. `tab`: An open tab in the browser. `url`: A URL that's not one of the other types.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.remote_tab
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.search
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.url
*/
trait ResultType extends js.Object

object ResultType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remote_tab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.remote_tab = this.cast("remote_tab")
  @scala.inline
  def search: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.search = this.cast("search")
  @scala.inline
  def tab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab = this.cast("tab")
  @scala.inline
  def url: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.url = this.cast("url")
}

