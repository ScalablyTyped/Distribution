package typings.firefoxWebextBrowser.browser.captivePortal

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonState
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* captivePortal events */
/** Fired when the captive portal state changes. */
@JSGlobal("browser.captivePortal.onStateChanged")
@js.native
object onStateChanged
  extends TopLevel[WebExtEvent[js.Function1[/* details */ AnonState, Unit]]]

