package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The operating system the browser is running on. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.mac
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.win
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.android
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.cros
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.linux
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.openbsd
*/
trait PlatformOs extends js.Object

object PlatformOs {
  @scala.inline
  def android: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cros: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.cros = this.cast("cros")
  @scala.inline
  def linux: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.mac = this.cast("mac")
  @scala.inline
  def openbsd: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def win: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.win = this.cast("win")
}

