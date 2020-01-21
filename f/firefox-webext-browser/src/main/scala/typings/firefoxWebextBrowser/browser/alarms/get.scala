package typings.firefoxWebextBrowser.browser.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.alarms.get")
@js.native
object get extends js.Object {
  /**
    * Retrieves details about the specified alarm.
    * @param [name] The name of the alarm to get. Defaults to the empty string.
    */
  def apply(): js.Promise[Alarm] = js.native
  def apply(name: String): js.Promise[Alarm] = js.native
}

