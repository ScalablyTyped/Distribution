package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTTP method to use if the URL uses the HTTP[S] protocol. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.GET
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.POST
*/
trait _DownloadMethod extends js.Object

object _DownloadMethod {
  @scala.inline
  def GET: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

