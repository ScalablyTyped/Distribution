package typings.firefoxWebextBrowser.browser.telemetry

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.AnonAddClientId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.telemetry.submitPing")
@js.native
object submitPing extends js.Object {
  /* telemetry functions */
  /**
    * Submits a custom ping to the Telemetry back-end. See `submitExternalPing` inside TelemetryController.jsm for
    * more details.
    * @param type The type of the ping.
    * @param message The data payload for the ping.
    * @param options Options object.
    */
  def apply(`type`: String, message: StringDictionary[js.Any], options: AnonAddClientId): js.Promise[_] = js.native
}

