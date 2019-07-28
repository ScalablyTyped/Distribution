package typings.firefoxDashWebextDashBrowser.browserNs.proxyNs

import typings.firefoxDashWebextDashBrowser.browserNs.webRequestNs.RequestFilter
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.requestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ProxyOnRequestEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, filter: RequestFilter): Unit = js.native
  @JSName("addListener")
  def addListener_requestHeaders(cb: TCallback, filter: RequestFilter, extraInfoSpec: js.Array[requestHeaders]): Unit = js.native
  def hasListener(cb: TCallback): Boolean = js.native
  def removeListener(cb: TCallback): Unit = js.native
}

