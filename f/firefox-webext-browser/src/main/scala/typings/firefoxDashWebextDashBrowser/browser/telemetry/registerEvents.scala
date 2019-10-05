package typings.firefoxDashWebextDashBrowser.browser.telemetry

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.telemetry.registerEvents")
@js.native
object registerEvents extends js.Object {
  /**
    * Register new events to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the events are registered in.
    * @param data An object that contains registration data for 1+ events. Each property name is the category name,
    *     and the corresponding property value is an object of EventData type.
    */
  def apply(category: String, data: StringDictionary[EventData]): js.Promise[_] = js.native
}

