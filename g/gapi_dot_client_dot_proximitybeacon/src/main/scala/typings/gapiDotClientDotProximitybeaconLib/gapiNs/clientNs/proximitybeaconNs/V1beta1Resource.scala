package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait V1beta1Resource extends js.Object {
  /**
               * Gets the Proximity Beacon API's current public key and associated
               * parameters used to initiate the Diffie-Hellman key exchange required to
               * register a beacon that broadcasts the Eddystone-EID format. This key
               * changes periodically; clients may cache it and re-use the same public key
               * to provision and register multiple beacons. However, clients should be
               * prepared to refresh this key when they encounter an error registering an
               * Eddystone-EID beacon.
               */
  def getEidparams(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[EphemeralIdRegistrationParams]
}

