package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDriveActivityResponse extends js.Object {
  var activities: js.UndefOr[
    js.Array[
      typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs.DriveActivity
    ]
  ] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object QueryDriveActivityResponse {
  @scala.inline
  def apply(
    activities: js.Array[
      typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs.DriveActivity
    ] = null,
    nextPageToken: String = null
  ): QueryDriveActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[QueryDriveActivityResponse]
  }
}

