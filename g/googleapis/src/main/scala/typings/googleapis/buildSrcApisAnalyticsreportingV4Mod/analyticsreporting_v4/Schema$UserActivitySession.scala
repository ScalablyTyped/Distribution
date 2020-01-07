package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a user session performed on a specific device at a certain
  * time over a period of time.
  */
@js.native
trait Schema$UserActivitySession extends js.Object {
  /**
    * Represents a detailed view into each of the activity in this session.
    */
  var activities: js.UndefOr[js.Array[Schema$Activity]] = js.native
  /**
    * The data source of a hit. By default, hits sent from analytics.js are
    * reported as &quot;web&quot; and hits sent from the mobile SDKs are
    * reported as &quot;app&quot;. These values can be overridden in the
    * Measurement Protocol.
    */
  var dataSource: js.UndefOr[String] = js.native
  /**
    * The type of device used: &quot;mobile&quot;, &quot;tablet&quot; etc.
    */
  var deviceCategory: js.UndefOr[String] = js.native
  /**
    * Platform on which the activity happened: &quot;android&quot;,
    * &quot;ios&quot; etc.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Date of this session in ISO-8601 format.
    */
  var sessionDate: js.UndefOr[String] = js.native
  /**
    * Unique ID of the session.
    */
  var sessionId: js.UndefOr[String] = js.native
}

object Schema$UserActivitySession {
  @scala.inline
  def apply(
    activities: js.Array[Schema$Activity] = null,
    dataSource: String = null,
    deviceCategory: String = null,
    platform: String = null,
    sessionDate: String = null,
    sessionId: String = null
  ): Schema$UserActivitySession = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (deviceCategory != null) __obj.updateDynamic("deviceCategory")(deviceCategory.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (sessionDate != null) __obj.updateDynamic("sessionDate")(sessionDate.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserActivitySession]
  }
}

