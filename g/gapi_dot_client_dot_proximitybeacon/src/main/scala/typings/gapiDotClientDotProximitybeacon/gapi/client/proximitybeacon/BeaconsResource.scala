package typings.gapiDotClientDotProximitybeacon.gapi.client.proximitybeacon

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotProximitybeacon.Anon_AccesstokenAltBeaconName
import typings.gapiDotClientDotProximitybeacon.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotProximitybeacon.Anon_AccesstokenAltBearertokenCallback
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
  def activate(request: Anon_AccesstokenAltBeaconName): Request[js.Object]
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
  def deactivate(request: Anon_AccesstokenAltBeaconName): Request[js.Object]
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
  def decommission(request: Anon_AccesstokenAltBeaconName): Request[js.Object]
  /**
    * Deletes the specified beacon including all diagnostics data for the beacon
    * as well as any attachments on the beacon (including those belonging to
    * other projects). This operation cannot be undone.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def delete(request: Anon_AccesstokenAltBeaconName): Request[js.Object]
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
  def get(request: Anon_AccesstokenAltBeaconName): Request[Beacon]
  /**
    * Searches the beacon registry for beacons that match the given search
    * criteria. Only those beacons that the client has permission to list
    * will be returned.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListBeaconsResponse]
  /**
    * Registers a previously unregistered beacon given its `advertisedId`.
    * These IDs are unique within the system. An ID can be registered only once.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def register(request: Anon_AccesstokenAltBearertokenCallback): Request[Beacon]
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
  def update(request: Anon_AccesstokenAltBeaconName): Request[Beacon]
}

object BeaconsResource {
  @scala.inline
  def apply(
    activate: Anon_AccesstokenAltBeaconName => Request[js.Object],
    attachments: AttachmentsResource,
    deactivate: Anon_AccesstokenAltBeaconName => Request[js.Object],
    decommission: Anon_AccesstokenAltBeaconName => Request[js.Object],
    delete: Anon_AccesstokenAltBeaconName => Request[js.Object],
    diagnostics: DiagnosticsResource,
    get: Anon_AccesstokenAltBeaconName => Request[Beacon],
    list: Anon_AccesstokenAltBearertoken => Request[ListBeaconsResponse],
    register: Anon_AccesstokenAltBearertokenCallback => Request[Beacon],
    update: Anon_AccesstokenAltBeaconName => Request[Beacon]
  ): BeaconsResource = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), attachments = attachments, deactivate = js.Any.fromFunction1(deactivate), decommission = js.Any.fromFunction1(decommission), delete = js.Any.fromFunction1(delete), diagnostics = diagnostics, get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), register = js.Any.fromFunction1(register), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BeaconsResource]
  }
}

