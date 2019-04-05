package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActivitiesResponse extends js.Object {
  var activities: js.UndefOr[js.Array[Activity]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListActivitiesResponse {
  @scala.inline
  def apply(activities: js.Array[Activity] = null, nextPageToken: java.lang.String = null): ListActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListActivitiesResponse]
  }
}

