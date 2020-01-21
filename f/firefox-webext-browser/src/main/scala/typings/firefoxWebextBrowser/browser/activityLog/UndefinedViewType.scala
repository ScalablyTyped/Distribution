package typings.firefoxWebextBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of view where the activity occurred. Content scripts will not have a viewType. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.background
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel
*/
trait UndefinedViewType extends js.Object

object UndefinedViewType {
  @scala.inline
  def background: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.background = this.cast("background")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools_page: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page = this.cast("devtools_page")
  @scala.inline
  def devtools_panel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel = this.cast("devtools_panel")
  @scala.inline
  def popup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
  @scala.inline
  def sidebar: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = this.cast("sidebar")
  @scala.inline
  def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
}

