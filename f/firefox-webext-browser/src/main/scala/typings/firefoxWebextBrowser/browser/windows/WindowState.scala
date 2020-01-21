package typings.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state of this browser window. Under some circumstances a Window may not be assigned state property, for
  * example when querying closed windows from the `sessions` API.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked
*/
trait WindowState extends js.Object

object WindowState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def docked: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked = this.cast("docked")
  @scala.inline
  def fullscreen: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def maximized: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized = this.cast("maximized")
  @scala.inline
  def minimized: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized = this.cast("minimized")
  @scala.inline
  def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
}

