package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Screen
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Window
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Application
*/
trait QueryScreen extends js.Object

object QueryScreen {
  @scala.inline
  def Application: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Application = this.cast("Application")
  @scala.inline
  def Screen: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Screen = this.cast("Screen")
  @scala.inline
  def Window: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Window = this.cast("Window")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

