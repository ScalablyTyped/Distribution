package typings
package firefoxDashWebextDashBrowserLib.browserNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ProxyOnRequestEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, filter: firefoxDashWebextDashBrowserLib.browserNs.webRequestNs.RequestFilter): scala.Unit = js.native
  @JSName("addListener")
  def addListener_requestHeaders(
    cb: TCallback,
    filter: firefoxDashWebextDashBrowserLib.browserNs.webRequestNs.RequestFilter,
    extraInfoSpec: js.Array[
      firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.requestHeaders
    ]
  ): scala.Unit = js.native
  def hasListener(cb: TCallback): scala.Boolean = js.native
  def removeListener(cb: TCallback): scala.Unit = js.native
}

