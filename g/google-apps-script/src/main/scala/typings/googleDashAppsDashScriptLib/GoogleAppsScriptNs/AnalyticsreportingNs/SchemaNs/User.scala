package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object User {
  @scala.inline
  def apply(`type`: java.lang.String = null, userId: java.lang.String = null): User = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[User]
  }
}

