package typings.firefoxDashWebextDashBrowser.browser.telemetry

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.telemetry.recordEvent")
@js.native
object recordEvent extends js.Object {
  /**
    * Record an event in Telemetry. Throws when trying to record an unknown event.
    * @param category The category name.
    * @param method The method name.
    * @param object The object name.
    * @param [value] An optional string value to record.
    * @param [extra] An optional object of the form (string -> string). It should only contain registered extra keys.
    */
  def apply(category: String, method: String, `object`: String): js.Promise[_] = js.native
  def apply(category: String, method: String, `object`: String, value: Double): js.Promise[_] = js.native
  def apply(category: String, method: String, `object`: String, value: Double, extra: StringDictionary[String]): js.Promise[_] = js.native
}

