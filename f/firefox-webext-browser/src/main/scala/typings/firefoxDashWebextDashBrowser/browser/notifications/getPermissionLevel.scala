package typings.firefoxDashWebextDashBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.notifications.getPermissionLevel")
@js.native
object getPermissionLevel extends js.Object {
  /**
    * Retrieves whether the user has enabled notifications from this app or extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(): js.Promise[PermissionLevel] = js.native
}

