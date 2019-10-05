package typings.firefoxDashWebextDashBrowser.browser.webRequest

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_DocumentUrlFrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* webRequest events */
/**
  * Fired when a request is about to occur.
  * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
  *     of this type.
  */
@JSGlobal("browser.webRequest.onBeforeRequest")
@js.native
object onBeforeRequest
  extends TopLevel[
      _WebRequestOnBeforeRequestEvent[
        js.Function1[
          /* details */ Anon_DocumentUrlFrameId, 
          BlockingResponse | js.Promise[BlockingResponse] | Unit
        ]
      ]
    ]

