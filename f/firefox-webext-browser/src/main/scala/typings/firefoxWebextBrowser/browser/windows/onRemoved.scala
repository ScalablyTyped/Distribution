package typings.firefoxWebextBrowser.browser.windows

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a window is removed (closed).
  * @param windowId ID of the removed window.
  */
@JSGlobal("browser.windows.onRemoved")
@js.native
object onRemoved
  extends TopLevel[WebExtEvent[js.Function1[/* windowId */ Double, Unit]]]

