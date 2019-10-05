package typings.firefoxDashWebextDashBrowser.browser.windows

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the currently focused window changes. Will be `windows.WINDOW_ID_NONE` if all browser windows have
  * lost focus. Note: On some Linux window managers, WINDOW_ID_NONE will always be sent immediately preceding a
  * switch from one browser window to another.
  * @param windowId ID of the newly focused window.
  */
@JSGlobal("browser.windows.onFocusChanged")
@js.native
object onFocusChanged
  extends TopLevel[WebExtEvent[js.Function1[/* windowId */ Double, Unit]]]

