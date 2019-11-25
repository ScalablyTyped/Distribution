package typings.firefoxDashWebextDashBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of view where the activity occurred. Content scripts will not have a viewType. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.background
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.sidebar
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.devtools_page
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.devtools_panel
*/
trait _UndefinedViewType extends js.Object

object _UndefinedViewType {
  @scala.inline
  def background: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.background = this.cast("background")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools_page: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.devtools_page = this.cast("devtools_page")
  @scala.inline
  def devtools_panel: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.devtools_panel = this.cast("devtools_panel")
  @scala.inline
  def popup: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup = this.cast("popup")
  @scala.inline
  def sidebar: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.sidebar = this.cast("sidebar")
  @scala.inline
  def tab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab = this.cast("tab")
}

