package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of window. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools
*/
trait WindowType extends js.Object

object WindowType {
  @scala.inline
  def app: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app = this.cast("app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools = this.cast("devtools")
  @scala.inline
  def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def panel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = this.cast("panel")
  @scala.inline
  def popup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
}

