package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarNotification extends js.Object {
  var method: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarNotification {
  @scala.inline
  def apply(method: java.lang.String = null, `type`: java.lang.String = null): CalendarNotification = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CalendarNotification]
  }
}

