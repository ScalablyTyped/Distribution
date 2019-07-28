package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object Delete {
  @scala.inline
  def apply(`type`: String = null): Delete = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Delete]
  }
}

