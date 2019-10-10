package typings.firefoxDashWebextDashBrowser.browser.webRequest

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_CookieStoreIdDocumentUrlFrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired just before a request is going to be sent to the server (modifications of previous onBeforeSendHeaders
  * callbacks are visible by the time onSendHeaders is fired).
  */
@JSGlobal("browser.webRequest.onSendHeaders")
@js.native
object onSendHeaders
  extends TopLevel[
      _WebRequestOnSendHeadersEvent[js.Function1[/* details */ Anon_CookieStoreIdDocumentUrlFrameId, Unit]]
    ]

