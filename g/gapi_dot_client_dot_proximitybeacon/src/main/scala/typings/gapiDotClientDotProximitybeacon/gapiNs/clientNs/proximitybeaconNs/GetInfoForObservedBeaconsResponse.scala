package typings.gapiDotClientDotProximitybeacon.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInfoForObservedBeaconsResponse extends js.Object {
  /**
    * Public information about beacons.
    * May be empty if the request matched no beacons.
    */
  var beacons: js.UndefOr[js.Array[BeaconInfo]] = js.undefined
}

object GetInfoForObservedBeaconsResponse {
  @scala.inline
  def apply(beacons: js.Array[BeaconInfo] = null): GetInfoForObservedBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    if (beacons != null) __obj.updateDynamic("beacons")(beacons)
    __obj.asInstanceOf[GetInfoForObservedBeaconsResponse]
  }
}

