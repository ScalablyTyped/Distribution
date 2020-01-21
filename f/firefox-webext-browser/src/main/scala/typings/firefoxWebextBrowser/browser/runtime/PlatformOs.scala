package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The operating system the browser is running on. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mac
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.win
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.android
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.cros
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.linux
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.openbsd
*/
trait PlatformOs extends js.Object

object PlatformOs {
  @scala.inline
  def android: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cros: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.cros = this.cast("cros")
  @scala.inline
  def linux: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mac = this.cast("mac")
  @scala.inline
  def openbsd: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def win: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.win = this.cast("win")
}

