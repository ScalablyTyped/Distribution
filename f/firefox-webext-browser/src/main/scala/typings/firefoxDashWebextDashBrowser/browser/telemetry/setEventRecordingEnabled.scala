package typings.firefoxDashWebextDashBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.telemetry.setEventRecordingEnabled")
@js.native
object setEventRecordingEnabled extends js.Object {
  /**
    * Enable recording of events in a category. Events default to recording disabled. This allows to toggle recording
    * for all events in the specified category.
    * @param category The category name.
    * @param enabled Whether recording is enabled for events in that category.
    */
  def apply(category: String, enabled: Boolean): js.Promise[_] = js.native
}

