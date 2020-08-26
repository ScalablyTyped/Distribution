package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var advertisedId: js.UndefOr[AdvertisedId] = js.native
  /**
    * Resource name of this beacon. A beacon name has the format
    * "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by
    * the beacon and N is a code for the beacon's type. Possible values are
    * `3` for Eddystone, `1` for iBeacon, or `5` for AltBeacon.
    *
    * This field must be left empty when registering. After reading a beacon,
    * clients can use the name for future operations.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * Free text used to identify and describe the beacon. Maximum length 140
    * characters.
    * Optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Write-only registration parameters for beacons using Eddystone-EID
    * (remotely resolved ephemeral ID) format. This information will not be
    * populated in API responses. When submitting this data, the `advertised_id`
    * field must contain an ID of type Eddystone-UID. Any other ID type will
    * result in an error.
    */
  var ephemeralIdRegistration: js.UndefOr[EphemeralIdRegistration] = js.native
  /**
    * Expected location stability. This is set when the beacon is registered or
    * updated, not automatically detected in any way.
    * Optional.
    */
  var expectedStability: js.UndefOr[String] = js.native
  /**
    * The indoor level information for this beacon, if known. As returned by the
    * Google Maps API.
    * Optional.
    */
  var indoorLevel: js.UndefOr[IndoorLevel] = js.native
  /**
    * The location of the beacon, expressed as a latitude and longitude pair.
    * This location is given when the beacon is registered or updated. It does
    * not necessarily indicate the actual current location of the beacon.
    * Optional.
    */
  var latLng: js.UndefOr[LatLng] = js.native
  /**
    * The [Google Places API](/places/place-id) Place ID of the place where
    * the beacon is deployed. This is given when the beacon is registered or
    * updated, not automatically detected in any way.
    * Optional.
    */
  var placeId: js.UndefOr[String] = js.native
  /**
    * Properties of the beacon device, for example battery type or firmware
    * version.
    * Optional.
    */
  var properties: js.UndefOr[Record[String, String]] = js.native
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
  var provisioningKey: js.UndefOr[String] = js.native
  /**
    * Current status of the beacon.
    * Required.
    */
  var status: js.UndefOr[String] = js.native
}

object Beacon {
  @scala.inline
  def apply(): Beacon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beacon]
  }
  @scala.inline
  implicit class BeaconOps[Self <: Beacon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvertisedId(value: AdvertisedId): Self = this.set("advertisedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisedId: Self = this.set("advertisedId", js.undefined)
    @scala.inline
    def setBeaconName(value: String): Self = this.set("beaconName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeaconName: Self = this.set("beaconName", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEphemeralIdRegistration(value: EphemeralIdRegistration): Self = this.set("ephemeralIdRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEphemeralIdRegistration: Self = this.set("ephemeralIdRegistration", js.undefined)
    @scala.inline
    def setExpectedStability(value: String): Self = this.set("expectedStability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedStability: Self = this.set("expectedStability", js.undefined)
    @scala.inline
    def setIndoorLevel(value: IndoorLevel): Self = this.set("indoorLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndoorLevel: Self = this.set("indoorLevel", js.undefined)
    @scala.inline
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceId: Self = this.set("placeId", js.undefined)
    @scala.inline
    def setProperties(value: Record[String, String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setProvisioningKey(value: String): Self = this.set("provisioningKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningKey: Self = this.set("provisioningKey", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

