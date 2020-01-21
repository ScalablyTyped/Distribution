package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonChallenger
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
      WebRequestOnAuthRequiredEvent[
        js.Function1[
          /* details */ AnonChallenger, 
          BlockingResponse | js.Promise[BlockingResponse] | Unit
        ]
      ]
    ]

