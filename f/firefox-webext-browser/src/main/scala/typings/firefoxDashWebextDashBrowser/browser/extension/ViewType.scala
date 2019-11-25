package typings.firefoxDashWebextDashBrowser.browser.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* extension types */
/** The type of extension view. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.sidebar
*/
trait ViewType extends js.Object

object ViewType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def popup: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup = this.cast("popup")
  @scala.inline
  def sidebar: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.sidebar = this.cast("sidebar")
  @scala.inline
  def tab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab = this.cast("tab")
}

