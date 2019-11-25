package typings.firefoxDashWebextDashBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state of this browser window. Under some circumstances a Window may not be assigned state property, for
  * example when querying closed windows from the `sessions` API.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.minimized
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.maximized
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.fullscreen
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.docked
*/
trait WindowState extends js.Object

object WindowState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def docked: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.docked = this.cast("docked")
  @scala.inline
  def fullscreen: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def maximized: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.maximized = this.cast("maximized")
  @scala.inline
  def minimized: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.minimized = this.cast("minimized")
  @scala.inline
  def normal: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal = this.cast("normal")
}

