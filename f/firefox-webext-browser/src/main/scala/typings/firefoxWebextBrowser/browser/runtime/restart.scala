package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.restart")
@js.native
object restart extends js.Object {
  /**
    * Restart the device when the app runs in kiosk mode. Otherwise, it's no-op.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(): Unit = js.native
}

