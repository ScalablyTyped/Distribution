package typings.firefoxDashWebextDashBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.requestHeaders
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.blocking
*/
trait OnBeforeSendHeadersOptions extends js.Object

object OnBeforeSendHeadersOptions {
  @scala.inline
  def blocking: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def requestHeaders: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.requestHeaders = this.cast("requestHeaders")
}

