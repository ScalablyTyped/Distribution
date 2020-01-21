package typings.firefoxWebextBrowser.browser.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.permissions.contains")
@js.native
object contains extends js.Object {
  /** Check if the extension has the given permissions. */
  def apply(permissions: AnyPermissions): js.Promise[Boolean] = js.native
}

