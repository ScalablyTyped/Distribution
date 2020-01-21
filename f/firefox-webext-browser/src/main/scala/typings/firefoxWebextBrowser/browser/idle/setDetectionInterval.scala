package typings.firefoxWebextBrowser.browser.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.idle.setDetectionInterval")
@js.native
object setDetectionInterval extends js.Object {
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for onStateChanged events.
    * The default interval is 60 seconds.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  def apply(intervalInSeconds: Double): Unit = js.native
}

