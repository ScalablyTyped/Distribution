package typings.firefoxDashWebextDashBrowser.browser.devtools.network

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.network events */
/**
  * Fired when a network request is finished and all request data are available.
  * @param request Description of a network request in the form of a HAR entry. See HAR specification for details.
  */
@JSGlobal("browser.devtools.network.onRequestFinished")
@js.native
object onRequestFinished
  extends TopLevel[WebExtEvent[js.Function1[/* request */ Request, Unit]]]

