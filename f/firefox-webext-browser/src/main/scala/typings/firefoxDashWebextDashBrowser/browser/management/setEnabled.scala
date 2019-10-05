package typings.firefoxDashWebextDashBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.management.setEnabled")
@js.native
object setEnabled extends js.Object {
  /**
    * Enables or disables the given add-on.
    * @param id ID of the add-on to enable/disable.
    * @param enabled Whether to enable or disable the add-on.
    */
  def apply(id: String, enabled: Boolean): js.Promise[Unit] = js.native
}

