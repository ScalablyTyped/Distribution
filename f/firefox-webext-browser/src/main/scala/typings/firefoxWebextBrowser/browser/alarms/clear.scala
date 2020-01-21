package typings.firefoxWebextBrowser.browser.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.alarms.clear")
@js.native
object clear extends js.Object {
  /**
    * Clears the alarm with the given name.
    * @param [name] The name of the alarm to clear. Defaults to the empty string.
    */
  def apply(): js.Promise[Boolean] = js.native
  def apply(name: String): js.Promise[Boolean] = js.native
}

