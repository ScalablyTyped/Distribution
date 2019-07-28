package typings.gapiDotClientDotAppsactivity.gapiNs.clientNs.appsactivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActivitiesResponse extends js.Object {
  /** List of activities. */
  var activities: js.UndefOr[js.Array[Activity]] = js.undefined
  /** Token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListActivitiesResponse {
  @scala.inline
  def apply(activities: js.Array[Activity] = null, nextPageToken: String = null): ListActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListActivitiesResponse]
  }
}

