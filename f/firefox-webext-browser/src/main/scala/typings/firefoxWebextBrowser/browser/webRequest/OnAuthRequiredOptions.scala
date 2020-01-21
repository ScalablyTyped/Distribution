package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.asyncBlocking
*/
trait OnAuthRequiredOptions extends js.Object

object OnAuthRequiredOptions {
  @scala.inline
  def asyncBlocking: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.asyncBlocking = this.cast("asyncBlocking")
  @scala.inline
  def blocking: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def responseHeaders: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders = this.cast("responseHeaders")
}

