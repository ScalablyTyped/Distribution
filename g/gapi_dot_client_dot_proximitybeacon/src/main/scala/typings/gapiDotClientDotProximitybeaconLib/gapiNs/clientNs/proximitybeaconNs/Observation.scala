package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Observation extends js.Object {
  /**
               * The ID advertised by the beacon the client has encountered.
               *
               * If the submitted `advertised_id` type is Eddystone-EID, then the client
               * must be authorized to resolve the given beacon. Otherwise no data will be
               * returned for that beacon.
               * Required.
               */
  var advertisedId: js.UndefOr[AdvertisedId] = js.undefined
  /**
               * The array of telemetry bytes received from the beacon. The server is
               * responsible for parsing it. This field may frequently be empty, as
               * with a beacon that transmits telemetry only occasionally.
               */
  var telemetry: js.UndefOr[java.lang.String] = js.undefined
  /** Time when the beacon was observed. */
  var timestampMs: js.UndefOr[java.lang.String] = js.undefined
}

