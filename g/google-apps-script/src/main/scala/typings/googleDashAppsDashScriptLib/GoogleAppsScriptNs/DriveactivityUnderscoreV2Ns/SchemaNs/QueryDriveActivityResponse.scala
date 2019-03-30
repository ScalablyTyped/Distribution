package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDriveActivityResponse extends js.Object {
  var activities: js.UndefOr[js.Array[DriveActivity]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object QueryDriveActivityResponse {
  @scala.inline
  def apply(activities: js.Array[DriveActivity] = null, nextPageToken: java.lang.String = null): QueryDriveActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[QueryDriveActivityResponse]
  }
}

