package typings.firefoxDashWebextDashBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an app or the device that it runs on needs to be restarted. The app should close all its windows at
  * its earliest convenient time to let the restart to happen. If the app does nothing, a restart will be enforced
  * after a 24-hour grace period has passed. Currently, this event is only fired for Chrome OS kiosk apps.
  * @param reason The reason that the event is being dispatched.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.runtime.onRestartRequired")
@js.native
object onRestartRequired
  extends TopLevel[
      js.UndefOr[WebExtEvent[js.Function1[/* reason */ OnRestartRequiredReason, Unit]]]
    ]

