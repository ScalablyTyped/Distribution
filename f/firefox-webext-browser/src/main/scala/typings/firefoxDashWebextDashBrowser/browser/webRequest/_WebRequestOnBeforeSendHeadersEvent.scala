package typings.firefoxDashWebextDashBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WebRequestOnBeforeSendHeadersEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, filter: RequestFilter): Unit = js.native
  def addListener(cb: TCallback, filter: RequestFilter, extraInfoSpec: js.Array[OnBeforeSendHeadersOptions]): Unit = js.native
  def hasListener(cb: TCallback): Boolean = js.native
  def removeListener(cb: TCallback): Unit = js.native
}

