package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an InterconnectLocations resource. The InterconnectLocations
  * resource describes the locations where you can connect to Google&#39;s
  * networks. For more information, see  Colocation Facilities.
  */
@js.native
trait SchemaInterconnectLocation extends js.Object {
  /**
    * [Output Only] The postal address of the Point of Presence, each line in
    * the address is separated by a newline character.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * [Output Only] Availability zone for this InterconnectLocation. Within a
    * metropolitan area (metro), maintenance will not be simultaneously
    * scheduled in more than one availability zone. Example: &quot;zone1&quot;
    * or &quot;zone2&quot;.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * [Output Only] Metropolitan area designator that indicates which city an
    * interconnect is located. For example: &quot;Chicago, IL&quot;,
    * &quot;Amsterdam, Netherlands&quot;.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * [Output Only] Continent for this location.
    */
  var continent: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] An optional description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The name of the provider for this facility (e.g., EQUINIX).
    */
  var facilityProvider: js.UndefOr[String] = js.native
  /**
    * [Output Only] A provider-assigned Identifier for this facility (e.g.,
    * Ashburn-DC1).
    */
  var facilityProviderFacilityId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#interconnectLocation
    * for interconnect locations.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The peeringdb identifier for this facility (corresponding
    * with a netfac type in peeringdb).
    */
  var peeringdbFacilityId: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of InterconnectLocation.RegionInfo objects, that
    * describe parameters pertaining to the relation between this
    * InterconnectLocation and various Google Cloud regions.
    */
  var regionInfos: js.UndefOr[js.Array[SchemaInterconnectLocationRegionInfo]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of this InterconnectLocation. If the status is
    * AVAILABLE, new Interconnects may be provisioned in this
    * InterconnectLocation. Otherwise, no new Interconnects may be provisioned.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaInterconnectLocation {
  @scala.inline
  def apply(): SchemaInterconnectLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectLocation]
  }
  @scala.inline
  implicit class SchemaInterconnectLocationOps[Self <: SchemaInterconnectLocation] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setContinent(value: String): Self = this.set("continent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinent: Self = this.set("continent", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFacilityProvider(value: String): Self = this.set("facilityProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacilityProvider: Self = this.set("facilityProvider", js.undefined)
    @scala.inline
    def setFacilityProviderFacilityId(value: String): Self = this.set("facilityProviderFacilityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacilityProviderFacilityId: Self = this.set("facilityProviderFacilityId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPeeringdbFacilityId(value: String): Self = this.set("peeringdbFacilityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeeringdbFacilityId: Self = this.set("peeringdbFacilityId", js.undefined)
    @scala.inline
    def setRegionInfosVarargs(value: SchemaInterconnectLocationRegionInfo*): Self = this.set("regionInfos", js.Array(value :_*))
    @scala.inline
    def setRegionInfos(value: js.Array[SchemaInterconnectLocationRegionInfo]): Self = this.set("regionInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionInfos: Self = this.set("regionInfos", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

