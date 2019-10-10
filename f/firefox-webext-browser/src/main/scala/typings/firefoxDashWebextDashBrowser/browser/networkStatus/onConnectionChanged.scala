package typings.firefoxDashWebextDashBrowser.browser.networkStatus

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* networkStatus events */
/** Fired when the network connection state changes. */
@JSGlobal("browser.networkStatus.onConnectionChanged")
@js.native
object onConnectionChanged
  extends TopLevel[WebExtEvent[js.Function1[/* details */ NetworkLinkInfo, Unit]]]

