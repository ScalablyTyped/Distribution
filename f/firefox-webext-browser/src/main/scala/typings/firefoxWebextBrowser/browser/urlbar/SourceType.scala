package typings.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible sources of results. `bookmarks`: The result comes from the user's bookmarks. `history`: The result
  * comes from the user's history. `search`: The result comes from a search engine. `tabs`: The result is an open
  * tab in the browser or a synced tab from another device.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.history
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.local
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.network
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def bookmarks: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks = "bookmarks".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks]
  @scala.inline
  def history: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.history = "history".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.history]
  @scala.inline
  def local: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.local = "local".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.local]
  @scala.inline
  def network: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.network = "network".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.network]
  @scala.inline
  def search: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = "search".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search]
  @scala.inline
  def tabs: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs = "tabs".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs]
}

