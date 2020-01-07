package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListLocationsResponse returns the list of all GKE locations and their
  * recommendation state.
  */
@js.native
trait Schema$ListLocationsResponse extends js.Object {
  /**
    * A full list of GKE locations.
    */
  var locations: js.UndefOr[js.Array[Schema$Location]] = js.native
  /**
    * Only return ListLocationsResponse that occur after the page_token. This
    * value should be populated from the ListLocationsResponse.next_page_token
    * if that response token was set (which happens when listing more Locations
    * than fit in a single ListLocationsResponse).
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

