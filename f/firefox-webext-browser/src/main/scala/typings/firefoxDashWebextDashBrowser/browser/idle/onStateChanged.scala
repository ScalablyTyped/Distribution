package typings.firefoxDashWebextDashBrowser.browser.idle

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* idle events */
/**
  * Fired when the system changes to an active or idle state. The event fires with "idle" if the the user has not
  * generated any input for a specified number of seconds, and "active" when the user generates input on an idle
  * system.
  */
@JSGlobal("browser.idle.onStateChanged")
@js.native
object onStateChanged
  extends TopLevel[WebExtEvent[js.Function1[/* newState */ IdleState, Unit]]]

