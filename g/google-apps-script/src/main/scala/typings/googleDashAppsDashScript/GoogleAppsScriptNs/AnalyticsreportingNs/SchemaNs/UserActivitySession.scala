package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserActivitySession extends js.Object {
  var activities: js.UndefOr[js.Array[Activity]] = js.undefined
  var dataSource: js.UndefOr[String] = js.undefined
  var deviceCategory: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var sessionDate: js.UndefOr[String] = js.undefined
  var sessionId: js.UndefOr[String] = js.undefined
}

object UserActivitySession {
  @scala.inline
  def apply(
    activities: js.Array[Activity] = null,
    dataSource: String = null,
    deviceCategory: String = null,
    platform: String = null,
    sessionDate: String = null,
    sessionId: String = null
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

