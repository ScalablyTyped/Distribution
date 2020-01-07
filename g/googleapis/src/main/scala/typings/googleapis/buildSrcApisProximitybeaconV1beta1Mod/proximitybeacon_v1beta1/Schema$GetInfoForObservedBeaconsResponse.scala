package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the requested beacons, optionally including attachment
  * data.
  */
@js.native
trait Schema$GetInfoForObservedBeaconsResponse extends js.Object {
  /**
    * Public information about beacons. May be empty if the request matched no
    * beacons.
    */
  var beacons: js.UndefOr[js.Array[Schema$BeaconInfo]] = js.native
}

object Schema$GetInfoForObservedBeaconsResponse {
  @scala.inline
  def apply(beacons: js.Array[Schema$BeaconInfo] = null): Schema$GetInfoForObservedBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    if (beacons != null) __obj.updateDynamic("beacons")(beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetInfoForObservedBeaconsResponse]
  }
}

