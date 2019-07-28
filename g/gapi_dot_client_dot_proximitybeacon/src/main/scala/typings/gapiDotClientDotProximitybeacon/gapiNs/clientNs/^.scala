package typings.gapiDotClientDotProximitybeacon.gapiNs.clientNs

import typings.gapiDotClientDotProximitybeacon.gapiDotClientDotProximitybeaconStrings.proximitybeacon
import typings.gapiDotClientDotProximitybeacon.gapiNs.clientNs.proximitybeaconNs.BeaconinfoResource
import typings.gapiDotClientDotProximitybeacon.gapiNs.clientNs.proximitybeaconNs.BeaconsResource
import typings.gapiDotClientDotProximitybeacon.gapiNs.clientNs.proximitybeaconNs.NamespacesResource
import typings.gapiDotClientDotProximitybeacon.gapiNs.clientNs.proximitybeaconNs.V1beta1Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val beaconinfo: BeaconinfoResource = js.native
  val beacons: BeaconsResource = js.native
  val namespaces: NamespacesResource = js.native
  val v1beta1: V1beta1Resource = js.native
  /** Load Google Proximity Beacon API v1beta1 */
  def load(
    name: proximitybeacon,
    version: typings.gapiDotClientDotProximitybeacon.gapiDotClientDotProximitybeaconStrings.v1beta1
  ): js.Thenable[Unit] = js.native
  def load(
    name: proximitybeacon,
    version: typings.gapiDotClientDotProximitybeacon.gapiDotClientDotProximitybeaconStrings.v1beta1,
    callback: js.Function0[_]
  ): Unit = js.native
}

