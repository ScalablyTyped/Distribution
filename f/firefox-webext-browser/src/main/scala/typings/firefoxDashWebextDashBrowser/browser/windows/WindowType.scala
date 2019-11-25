package typings.firefoxDashWebextDashBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* windows types */
/**
  * The type of browser window this is. Under some circumstances a Window may not be assigned type property, for
  * example when querying closed windows from the `sessions` API.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.panel
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.app
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.devtools
*/
trait WindowType extends js.Object

object WindowType {
  @scala.inline
  def app: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.app = this.cast("app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.devtools = this.cast("devtools")
  @scala.inline
  def normal: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def panel: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.panel = this.cast("panel")
  @scala.inline
  def popup: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup = this.cast("popup")
}

