package typings.firefoxWebextBrowser.browser.windows

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* windows events */
/**
  * Fired when a window is created.
  * @param window Details of the window that was created.
  */
@JSGlobal("browser.windows.onCreated")
@js.native
object onCreated
  extends TopLevel[WebExtEvent[js.Function1[/* window */ Window, Unit]]]

