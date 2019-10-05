package typings.firefoxDashWebextDashBrowser.browser.webRequest

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_DocumentUrlFrameIdFromCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the first byte of the response body is received. For HTTP requests, this means that the status line
  * and response headers are available.
  */
@JSGlobal("browser.webRequest.onResponseStarted")
@js.native
object onResponseStarted
  extends TopLevel[
      _WebRequestOnResponseStartedEvent[js.Function1[/* details */ Anon_DocumentUrlFrameIdFromCache, Unit]]
    ]

