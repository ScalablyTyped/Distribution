package typings.firefoxWebextBrowser.browser.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.permissions.getAll")
@js.native
object getAll extends js.Object {
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  def apply(): js.Promise[AnyPermissions] = js.native
}

