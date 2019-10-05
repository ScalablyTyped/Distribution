package typings.firefoxDashWebextDashBrowser.browser.webRequest

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_Challenger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an authentication failure is received. The listener has three options: it can provide authentication
  * credentials, it can cancel the request and display the error page, or it can take no action on the challenge. If
  * bad user credentials are provided, this may be called multiple times for the same request.
  * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
  *     of this type.
  */
@JSGlobal("browser.webRequest.onAuthRequired")
@js.native
object onAuthRequired
  extends TopLevel[
      _WebRequestOnAuthRequiredEvent[
        js.Function1[
          /* details */ Anon_Challenger, 
          BlockingResponse | js.Promise[BlockingResponse] | Unit
        ]
      ]
    ]

