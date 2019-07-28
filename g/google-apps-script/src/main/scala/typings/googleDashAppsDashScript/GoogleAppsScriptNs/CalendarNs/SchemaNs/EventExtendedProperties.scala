package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventExtendedProperties extends js.Object {
  var `private`: js.UndefOr[js.Object] = js.undefined
  var shared: js.UndefOr[js.Object] = js.undefined
}

object EventExtendedProperties {
  @scala.inline
  def apply(`private`: js.Object = null, shared: js.Object = null): EventExtendedProperties = {
    val __obj = js.Dynamic.literal()
    if (`private` != null) __obj.updateDynamic("private")(`private`)
    if (shared != null) __obj.updateDynamic("shared")(shared)
    __obj.asInstanceOf[EventExtendedProperties]
  }
}

