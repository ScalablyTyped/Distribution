package typings.firefoxDashWebextDashBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and
  * 'tab' are supported. showDefaults cannot be used with this option.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.bookmark
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab
*/
trait _OverrideContextContext extends js.Object

object _OverrideContextContext {
  @scala.inline
  def bookmark: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.bookmark = this.cast("bookmark")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab = this.cast("tab")
}

