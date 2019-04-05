package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityId extends js.Object {
  var applicationName: js.UndefOr[java.lang.String] = js.undefined
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  var time: js.UndefOr[java.lang.String] = js.undefined
  var uniqueQualifier: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityId {
  @scala.inline
  def apply(
    applicationName: java.lang.String = null,
    customerId: java.lang.String = null,
    time: java.lang.String = null,
    uniqueQualifier: java.lang.String = null
  ): ActivityId = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (time != null) __obj.updateDynamic("time")(time)
    if (uniqueQualifier != null) __obj.updateDynamic("uniqueQualifier")(uniqueQualifier)
    __obj.asInstanceOf[ActivityId]
  }
}

