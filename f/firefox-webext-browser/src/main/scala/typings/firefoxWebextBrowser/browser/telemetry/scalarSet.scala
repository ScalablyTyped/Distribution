package typings.firefoxWebextBrowser.browser.telemetry

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.telemetry.scalarSet")
@js.native
object scalarSet extends js.Object {
  /**
    * Sets the named scalar to the given value. Throws if the value type doesn't match the scalar type.
    * @param name The scalar name
    * @param value The value to set the scalar to
    */
  def apply(name: String, value: String): js.Promise[_] = js.native
  def apply(name: String, value: StringDictionary[js.Any]): js.Promise[_] = js.native
  def apply(name: String, value: Boolean): js.Promise[_] = js.native
  def apply(name: String, value: Double): js.Promise[_] = js.native
}

