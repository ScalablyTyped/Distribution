package typings.firefoxWebextBrowser.browser.telemetry

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.telemetry.registerScalars")
@js.native
object registerScalars extends js.Object {
  /**
    * Register new scalars to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the scalars are registered in.
    * @param data An object that contains registration data for multiple scalars. Each property name is the scalar
    *     name, and the corresponding property value is an object of ScalarData type.
    */
  def apply(category: String, data: StringDictionary[ScalarData]): js.Promise[_] = js.native
}

