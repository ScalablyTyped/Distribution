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
  def docked: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked = "docked".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked]
  @scala.inline
  def fullscreen: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen = "fullscreen".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen]
  @scala.inline
  def maximized: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized = "maximized".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized]
  @scala.inline
  def minimized: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized = "minimized".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized]
  @scala.inline
  def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
}

