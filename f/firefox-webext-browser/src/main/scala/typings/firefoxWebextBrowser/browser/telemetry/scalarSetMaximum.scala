package typings.firefoxWebextBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.telemetry.scalarSetMaximum")
@js.native
object scalarSetMaximum extends js.Object {
  /**
    * Sets the scalar to the maximum of the current and the passed value
    * @param name The scalar name.
    * @param value The numeric value to set the scalar to. Only unsigned integers supported.
    */
  def apply(name: String, value: Double): js.Promise[_] = js.native
}

