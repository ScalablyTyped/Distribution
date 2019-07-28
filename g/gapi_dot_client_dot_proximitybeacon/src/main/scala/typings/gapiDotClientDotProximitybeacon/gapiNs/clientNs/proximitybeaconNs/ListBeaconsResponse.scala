package typings.gapiDotClientDotProximitybeacon.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBeaconsResponse extends js.Object {
  /** The beacons that matched the search criteria. */
  var beacons: js.UndefOr[js.Array[Beacon]] = js.undefined
  /**
    * An opaque pagination token that the client may provide in their next
    * request to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * Estimate of the total number of beacons matched by the query. Higher
    * values may be less accurate.
    */
  var totalCount: js.UndefOr[String] = js.undefined
}

object ListBeaconsResponse {
  @scala.inline
  def apply(beacons: js.Array[Beacon] = null, nextPageToken: String = null, totalCount: String = null): ListBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    if (beacons != null) __obj.updateDynamic("beacons")(beacons)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalCount != null) __obj.updateDynamic("totalCount")(totalCount)
    __obj.asInstanceOf[ListBeaconsResponse]
  }
}

