package typings.gapiClientProximitybeacon

import typings.gapiClientProximitybeacon.gapi.client.proximitybeacon.BeaconinfoResource
import typings.gapiClientProximitybeacon.gapi.client.proximitybeacon.BeaconsResource
import typings.gapiClientProximitybeacon.gapi.client.proximitybeacon.NamespacesResource
import typings.gapiClientProximitybeacon.gapi.client.proximitybeacon.V1beta1Resource
import typings.gapiClientProximitybeacon.gapiClientProximitybeaconStrings.proximitybeacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val beaconinfo: BeaconinfoResource = js.native
      val beacons: BeaconsResource = js.native
      val namespaces: NamespacesResource = js.native
      val v1beta1: V1beta1Resource = js.native
      /** Load Google Proximity Beacon API v1beta1 */
      def load(
        name: proximitybeacon,
        version: typings.gapiClientProximitybeacon.gapiClientProximitybeaconStrings.v1beta1
      ): js.Thenable[Unit] = js.native
      def load(
        name: proximitybeacon,
        version: typings.gapiClientProximitybeacon.gapiClientProximitybeaconStrings.v1beta1,
        callback: js.Function0[_]
      ): Unit = js.native
    }
    
  }
  
}

