package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestBody
*/
trait OnBeforeRequestOptions extends js.Object

object OnBeforeRequestOptions {
  @scala.inline
  def blocking: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def requestBody: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestBody = this.cast("requestBody")
}

