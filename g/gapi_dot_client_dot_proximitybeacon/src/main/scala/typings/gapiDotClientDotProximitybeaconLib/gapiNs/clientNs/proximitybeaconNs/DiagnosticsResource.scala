package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticsResource extends js.Object {
  /**
    * List the diagnostics for a single beacon. You can also list diagnostics for
    * all the beacons owned by your Google Developers Console project by using
    * the beacon name `beacons/-`.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAlertFilter): gapiDotClientLib.gapiNs.clientNs.Request[ListDiagnosticsResponse]
}

object DiagnosticsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAlertFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDiagnosticsResponse]
    ]
  ): DiagnosticsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[DiagnosticsResource]
  }
}

