package typings.firefoxDashWebextDashBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.insecure
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.weak
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.broken
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.secure
*/
trait _SecurityInfoState extends js.Object

object _SecurityInfoState {
  @scala.inline
  def broken: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def insecure: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.insecure = this.cast("insecure")
  @scala.inline
  def secure: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.secure = this.cast("secure")
  @scala.inline
  def weak: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.weak = this.cast("weak")
}

