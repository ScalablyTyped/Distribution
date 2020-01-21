package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking
*/
trait OnBeforeSendHeadersOptions extends js.Object

object OnBeforeSendHeadersOptions {
  @scala.inline
  def blocking: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def requestHeaders: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders = this.cast("requestHeaders")
}

