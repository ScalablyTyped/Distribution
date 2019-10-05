package typings.firefoxDashWebextDashBrowser.browser.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.permissions.request")
@js.native
object request extends js.Object {
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  def apply(permissions: Permissions): js.Promise[Boolean] = js.native
}

