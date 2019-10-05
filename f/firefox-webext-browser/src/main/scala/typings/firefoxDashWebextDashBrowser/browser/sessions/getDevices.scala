package typings.firefoxDashWebextDashBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.getDevices")
@js.native
object getDevices extends js.Object {
  /**
    * Retrieves all devices with synced sessions.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(): js.Promise[js.Array[Device]] = js.native
  def apply(filter: Filter): js.Promise[js.Array[Device]] = js.native
}

