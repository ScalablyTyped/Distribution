package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconsResource extends js.Object {
  var attachments: AttachmentsResource
  var diagnostics: DiagnosticsResource
  /**
    * Activates a beacon. A beacon that is active will return information
    * and attachment data when queried via `beaconinfo.getforobserved`.
    * Calling this method on an already active beacon will do nothing (but
    * will return a successful response code).
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def activate(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBeaconName): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Deactivates a beacon. Once deactivated, the API will not return
    * information nor attachment data for the beacon when queried via
    * `beaconinfo.getforobserved`. Calling this method on an already inactive
    * beacon will do nothing (but will return a successful response code).
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def deactivate(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBeaconName): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Decommissions the specified beacon in the service. This beacon will no
    * longer be returned from `beaconinfo.getforobserved`. This operation is
    * permanent -- you will not be able to re-register a beacon with this ID
    * again.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def decommission(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBeaconName): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Deletes the specified beacon including all diagnostics data for the beacon
    * as well as any attachments on the beacon (including those belonging to
    * other projects). This operation cannot be undone.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def delete(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBeaconName): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Returns detailed information about the specified beacon.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    *
    * Requests may supply an Eddystone-EID beacon name in the form:
    * `beacons/4!beaconId` where the `beaconId` is the base16 ephemeral ID
    * broadcast by the beacon. The returned `Beacon` object will contain the
    * beacon's stable Eddystone-UID. Clients not authorized to resolve the
    * beacon's ephemeral Eddystone-EID broadcast will receive an error.
    */
  def get(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBeaconName): gapiDotClientLib.gapiNs.clientNs.Request[Beacon]
  /**
    * Searches the beacon registry for beacons that match the given search
    * criteria. Only those beacons that the client has permission to list
    * will be returned.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListBeaconsResponse]
  /**
    * Registers a previously unregistered beacon given its `advertisedId`.
    * These IDs are unique within the system. An ID can be registered only once.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def register(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Beacon]
  /**
    * Updates the information about the specified beacon. &#42;&#42;Any field that you do
    * not populate in the submitted beacon will be permanently erased&#42;&#42;, so you
    * should follow the "read, modify, write" pattern to avoid inadvertently
    * destroying data.
    *
    * Changes to the beacon status via this method will be  silently ignored.
    * To update beacon status, use the separate methods on this API for
    * activation, deactivation, and decommissioning.
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def update(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBeaconName): gapiDotClientLib.gapiNs.clientNs.Request[Beacon]
}

