package typings.firefoxWebextBrowser.browser.proxy

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonCookieStoreId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* proxy events */
/** Fired when proxy data is needed for a request. */
@JSGlobal("browser.proxy.onRequest")
@js.native
object onRequest
  extends TopLevel[ProxyOnRequestEvent[js.Function1[/* details */ AnonCookieStoreId, Unit]]]

