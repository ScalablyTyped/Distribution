package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocationsResponse extends js.Object {
  var locations: js.Array[Location]
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListLocationsResponse {
  @scala.inline
  def apply(locations: js.Array[Location], nextPageToken: String = null): ListLocationsResponse = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocationsResponse]
  }
}

