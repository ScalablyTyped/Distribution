package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleCloudMlV1__ListLocationsResponse extends js.Object {
  /**
    * Locations where at least one type of CMLE capability is available.
    */
  var locations: js.UndefOr[js.Array[Schema$GoogleCloudMlV1__Location]] = js.native
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__ListLocationsResponse {
  @scala.inline
  def apply(locations: js.Array[Schema$GoogleCloudMlV1__Location] = null, nextPageToken: String = null): Schema$GoogleCloudMlV1__ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__ListLocationsResponse]
  }
}

