package typings.firefoxDashWebextDashBrowser.browser.captivePortal

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This notification will be emitted when the captive portal service has determined that we can connect to the
  * internet. The service will pass either `captive` if there is an unlocked captive portal present, or `clear` if
  * no captive portal was detected.
  */
@JSGlobal("browser.captivePortal.onConnectivityAvailable")
@js.native
object onConnectivityAvailable
  extends TopLevel[WebExtEvent[js.Function1[/* status */ _Status, Unit]]]

