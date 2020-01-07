package typings.googleapis.buildSrcApisRedisV1Mod.redis_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Locations.ListLocations.
  */
@js.native
trait Schema$ListLocationsResponse extends js.Object {
  /**
    * A list of locations that matches the specified filter in the request.
    */
  var locations: js.UndefOr[js.Array[Schema$Location]] = js.native
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListLocationsResponse {
  @scala.inline
  def apply(locations: js.Array[Schema$Location] = null, nextPageToken: String = null): Schema$ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListLocationsResponse]
  }
}

