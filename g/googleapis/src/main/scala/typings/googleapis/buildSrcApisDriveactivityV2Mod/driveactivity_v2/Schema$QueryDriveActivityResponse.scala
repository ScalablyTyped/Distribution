package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for querying Drive activity.
  */
@js.native
trait Schema$QueryDriveActivityResponse extends js.Object {
  /**
    * List of activity requested.
    */
  var activities: js.UndefOr[js.Array[Schema$DriveActivity]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$QueryDriveActivityResponse {
  @scala.inline
  def apply(activities: js.Array[Schema$DriveActivity] = null, nextPageToken: String = null): Schema$QueryDriveActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryDriveActivityResponse]
  }
}

