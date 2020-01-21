package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  /**
    * The identifier of a beacon as advertised by it. This field must be
    * populated when registering. It may be empty when updating a beacon
    * record because it is ignored in updates.
    *
    * When registering a beacon that broadcasts Eddystone-EID, this field
    * should contain a "stable" Eddystone-UID that identifies the beacon and
    * links it to its attachments. The stable Eddystone-UID is only used for
    * administering the beacon.
    */
  var advertisedId: js.UndefOr[AdvertisedId] = js.undefined
  /**
    * Resource name of this beacon. A beacon name has the format
    * "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by
    * the beacon and N is a code for the beacon's type. Possible values are
    * `3` for Eddystone, `1` for iBeacon, or `5` for AltBeacon.
    *
    * This field must be left empty when registering. After reading a beacon,
    * clients can use the name for future operations.
    */
  var beaconName: js.UndefOr[String] = js.undefined
  /**
    * Free text used to identify and describe the beacon. Maximum length 140
    * characters.
    * Optional.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Write-only registration parameters for beacons using Eddystone-EID
    * (remotely resolved ephemeral ID) format. This information will not be
    * populated in API responses. When submitting this data, the `advertised_id`
    * field must contain an ID of type Eddystone-UID. Any other ID type will
    * result in an error.
    */
  var ephemeralIdRegistration: js.UndefOr[EphemeralIdRegistration] = js.undefined
  /**
    * Expected location stability. This is set when the beacon is registered or
    * updated, not automatically detected in any way.
    * Optional.
    */
  var expectedStability: js.UndefOr[String] = js.undefined
  /**
    * The indoor level information for this beacon, if known. As returned by the
    * Google Maps API.
    * Optional.
    */
  var indoorLevel: js.UndefOr[IndoorLevel] = js.undefined
  /**
    * The location of the beacon, expressed as a latitude and longitude pair.
    * This location is given when the beacon is registered or updated. It does
    * not necessarily indicate the actual current location of the beacon.
    * Optional.
    */
  var latLng: js.UndefOr[LatLng] = js.undefined
  /**
    * The [Google Places API](/places/place-id) Place ID of the place where
    * the beacon is deployed. This is given when the beacon is registered or
    * updated, not automatically detected in any way.
    * Optional.
    */
  var placeId: js.UndefOr[String] = js.undefined
  /**
    * Properties of the beacon device, for example battery type or firmware
    * version.
    * Optional.
    */
  var properties: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Some beacons may require a user to provide an authorization key before
    * changing any of its configuration (e.g. broadcast frames, transmit power).
    * This field provides a place to store and control access to that key.
    * This field is populated in responses to `GET /v1beta1/beacons/3!beaconId`
    * from users with write access to the given beacon. That is to say: If the
    * user is authorized to write the beacon's confidential data in the service,
    * the service considers them authorized to configure the beacon. Note
    * that this key grants nothing on the service, only on the beacon itself.
    */
  var provisioningKey: js.UndefOr[String] = js.undefined
  /**
    * Current status of the beacon.
    * Required.
    */
  var status: js.UndefOr[String] = js.undefined
}

object Beacon {
  @scala.inline
  def apply(
    advertisedId: AdvertisedId = null,
    beaconName: String = null,
    description: String = null,
    ephemeralIdRegistration: EphemeralIdRegistration = null,
    expectedStability: String = null,
    indoorLevel: IndoorLevel = null,
    latLng: LatLng = null,
    placeId: String = null,
    properties: Record[String, String] = null,
    provisioningKey: String = null,
    status: String = null
  ): Beacon = {
    val __obj = js.Dynamic.literal()
    if (advertisedId != null) __obj.updateDynamic("advertisedId")(advertisedId.asInstanceOf[js.Any])
    if (beaconName != null) __obj.updateDynamic("beaconName")(beaconName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ephemeralIdRegistration != null) __obj.updateDynamic("ephemeralIdRegistration")(ephemeralIdRegistration.asInstanceOf[js.Any])
    if (expectedStability != null) __obj.updateDynamic("expectedStability")(expectedStability.asInstanceOf[js.Any])
    if (indoorLevel != null) __obj.updateDynamic("indoorLevel")(indoorLevel.asInstanceOf[js.Any])
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (provisioningKey != null) __obj.updateDynamic("provisioningKey")(provisioningKey.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacon]
  }
}

