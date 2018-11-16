package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val beaconinfo: gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs.BeaconinfoResource = js.native
  val beacons: gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs.BeaconsResource = js.native
  val namespaces: gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs.NamespacesResource = js.native
  val v1beta1: gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs.V1beta1Resource = js.native
  /** Load Google Proximity Beacon API v1beta1 */
  def load(
    name: gapiDotClientDotProximitybeaconLib.gapiDotClientDotProximitybeaconLibStrings.proximitybeacon,
    version: gapiDotClientDotProximitybeaconLib.gapiDotClientDotProximitybeaconLibStrings.v1beta1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotProximitybeaconLib.gapiDotClientDotProximitybeaconLibStrings.proximitybeacon,
    version: gapiDotClientDotProximitybeaconLib.gapiDotClientDotProximitybeaconLibStrings.v1beta1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

