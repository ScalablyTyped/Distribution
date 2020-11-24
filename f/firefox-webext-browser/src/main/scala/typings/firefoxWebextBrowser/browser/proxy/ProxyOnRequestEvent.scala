package typings.firefoxWebextBrowser.browser.proxy

import typings.firefoxWebextBrowser.browser.webRequest.RequestFilter
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyOnRequestEvent[TCallback] extends js.Object {
  
  def addListener(cb: TCallback, filter: RequestFilter): Unit = js.native
  @JSName("addListener")
  def addListener_requestHeaders(cb: TCallback, filter: RequestFilter, extraInfoSpec: js.Array[requestHeaders]): Unit = js.native
  
  def hasListener(cb: TCallback): Boolean = js.native
  
  def removeListener(cb: TCallback): Unit = js.native
}
