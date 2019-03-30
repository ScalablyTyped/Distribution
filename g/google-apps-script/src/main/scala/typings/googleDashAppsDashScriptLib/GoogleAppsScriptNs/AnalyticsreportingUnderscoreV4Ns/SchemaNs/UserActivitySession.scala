package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserActivitySession extends js.Object {
  var activities: js.UndefOr[js.Array[Activity]] = js.undefined
  var dataSource: js.UndefOr[java.lang.String] = js.undefined
  var deviceCategory: js.UndefOr[java.lang.String] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var sessionDate: js.UndefOr[java.lang.String] = js.undefined
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
}

object UserActivitySession {
  @scala.inline
  def apply(
    activities: js.Array[Activity] = null,
    dataSource: java.lang.String = null,
    deviceCategory: java.lang.String = null,
    platform: java.lang.String = null,
    sessionDate: java.lang.String = null,
    sessionId: java.lang.String = null
  ): UserActivitySession = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (deviceCategory != null) __obj.updateDynamic("deviceCategory")(deviceCategory)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (sessionDate != null) __obj.updateDynamic("sessionDate")(sessionDate)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    __obj.asInstanceOf[UserActivitySession]
  }
}

