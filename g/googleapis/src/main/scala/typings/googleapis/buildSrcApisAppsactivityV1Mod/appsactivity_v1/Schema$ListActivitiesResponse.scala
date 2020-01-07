package typings.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from the list request. Contains a list of activities and a
  * token to retrieve the next page of results.
  */
@js.native
trait Schema$ListActivitiesResponse extends js.Object {
  /**
    * List of activities.
    */
  var activities: js.UndefOr[js.Array[Schema$Activity]] = js.native
  /**
    * Token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListActivitiesResponse {
  @scala.inline
  def apply(activities: js.Array[Schema$Activity] = null, nextPageToken: String = null): Schema$ListActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListActivitiesResponse]
  }
}

