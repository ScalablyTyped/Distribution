package typings.firefoxDashWebextDashBrowser.browserNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WebRequestOnHeadersReceivedEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, filter: RequestFilter): Unit = js.native
  def addListener(cb: TCallback, filter: RequestFilter, extraInfoSpec: js.Array[OnHeadersReceivedOptions]): Unit = js.native
  def hasListener(cb: TCallback): Boolean = js.native
  def removeListener(cb: TCallback): Unit = js.native
}

