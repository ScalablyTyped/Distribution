package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDriveActivityResponse extends js.Object {
  var activities: js.UndefOr[js.Array[DriveActivity]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object QueryDriveActivityResponse {
  @scala.inline
  def apply(activities: js.Array[DriveActivity] = null, nextPageToken: String = null): QueryDriveActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDriveActivityResponse]
  }
}

