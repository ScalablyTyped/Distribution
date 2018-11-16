package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Diagnostics extends js.Object {
  /** An unordered list of Alerts that the beacon has. */
  var alerts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Resource name of the beacon. For Eddystone-EID beacons, this may
               * be the beacon's current EID, or the beacon's "stable" Eddystone-UID.
               */
  var beaconName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The date when the battery is expected to be low. If the value is missing
               * then there is no estimate for when the battery will be low.
               * This value is only an estimate, not an exact date.
               */
  var estimatedLowBatteryDate: js.UndefOr[Date] = js.undefined
}

