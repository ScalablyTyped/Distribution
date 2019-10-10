package typings.firefoxDashWebextDashBrowser.browser.webRequest

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_CookieStoreIdDocumentUrlFrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired before sending an HTTP request, once the request headers are available. This may occur after a TCP
  * connection is made to the server, but before any HTTP data is sent.
  * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
  *     of this type.
  */
@JSGlobal("browser.webRequest.onBeforeSendHeaders")
@js.native
object onBeforeSendHeaders
  extends TopLevel[
      _WebRequestOnBeforeSendHeadersEvent[
        js.Function1[
          /* details */ Anon_CookieStoreIdDocumentUrlFrameId, 
          BlockingResponse | js.Promise[BlockingResponse] | Unit
        ]
      ]
    ]

