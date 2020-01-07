package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response that contains list beacon results and pagination help.
  */
@js.native
trait Schema$ListBeaconsResponse extends js.Object {
  /**
    * The beacons that matched the search criteria.
    */
  var beacons: js.UndefOr[js.Array[Schema$Beacon]] = js.native
  /**
    * An opaque pagination token that the client may provide in their next
    * request to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimate of the total number of beacons matched by the query. Higher
    * values may be less accurate.
    */
  var totalCount: js.UndefOr[String] = js.native
}

object Schema$ListBeaconsResponse {
  @scala.inline
  def apply(beacons: js.Array[Schema$Beacon] = null, nextPageToken: String = null, totalCount: String = null): Schema$ListBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    if (beacons != null) __obj.updateDynamic("beacons")(beacons.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalCount != null) __obj.updateDynamic("totalCount")(totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListBeaconsResponse]
  }
}

