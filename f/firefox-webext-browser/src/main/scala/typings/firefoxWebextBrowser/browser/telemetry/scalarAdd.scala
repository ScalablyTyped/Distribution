package typings.firefoxWebextBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.telemetry.scalarAdd")
@js.native
object scalarAdd extends js.Object {
  /**
    * Adds the value to the given scalar.
    * @param name The scalar name.
    * @param value The numeric value to add to the scalar. Only unsigned integers supported.
    */
  def apply(name: String, value: Double): js.Promise[_] = js.native
}

