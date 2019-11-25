package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesListResponse extends js.Object {
  var floodlightActivities: js.UndefOr[js.Array[FloodlightActivity]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object FloodlightActivitiesListResponse {
  @scala.inline
  def apply(
    floodlightActivities: js.Array[FloodlightActivity] = null,
    kind: String = null,
    nextPageToken: String = null
  ): FloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivities != null) __obj.updateDynamic("floodlightActivities")(floodlightActivities.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivitiesListResponse]
  }
}

