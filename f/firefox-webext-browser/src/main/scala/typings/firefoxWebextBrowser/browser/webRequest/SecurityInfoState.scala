package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.insecure
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.weak
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.broken
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.secure
*/
trait SecurityInfoState extends js.Object

object SecurityInfoState {
  @scala.inline
  def broken: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def insecure: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.insecure = this.cast("insecure")
  @scala.inline
  def secure: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.secure = this.cast("secure")
  @scala.inline
  def weak: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.weak = this.cast("weak")
}

