package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityEvents extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[js.Array[ActivityEventsParameters]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityEvents {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    parameters: js.Array[ActivityEventsParameters] = null,
    `type`: java.lang.String = null
  ): ActivityEvents = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityEvents]
  }
}

