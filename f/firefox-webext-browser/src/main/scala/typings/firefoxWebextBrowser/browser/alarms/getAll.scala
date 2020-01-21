package typings.firefoxWebextBrowser.browser.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.alarms.getAll")
@js.native
object getAll extends js.Object {
  /** Gets an array of all the alarms. */
  def apply(): js.Promise[js.Array[Alarm]] = js.native
}

