package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when HTTP response headers of a request have been received.
  * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
  *     of this type.
  */
@JSGlobal("browser.webRequest.onHeadersReceived")
@js.native
object onHeadersReceived
  extends TopLevel[
      WebRequestOnHeadersReceivedEvent[
        js.Function1[/* details */ AnonMethod, BlockingResponse | js.Promise[BlockingResponse] | Unit]
      ]
    ]

