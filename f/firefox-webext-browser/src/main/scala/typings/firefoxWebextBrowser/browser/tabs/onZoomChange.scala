package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonNewZoomFactor
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is zoomed. */
@JSGlobal("browser.tabs.onZoomChange")
@js.native
object onZoomChange
  extends TopLevel[WebExtEvent[js.Function1[/* ZoomChangeInfo */ AnonNewZoomFactor, Unit]]]

