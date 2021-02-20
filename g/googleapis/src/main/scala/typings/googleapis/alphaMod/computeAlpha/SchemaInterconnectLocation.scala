package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an InterconnectLocations resource. The InterconnectLocations
  * resource describes the locations where you can connect to Google&#39;s
  * networks. For more information, see  Colocation Facilities.
  */
@js.native
trait SchemaInterconnectLocation extends StObject {
  
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
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  
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
  implicit class SchemaInterconnectLocationMutableBuilder[Self <: SchemaInterconnectLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFacilityProvider(value: String): Self = StObject.set(x, "facilityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilityProviderFacilityId(value: String): Self = StObject.set(x, "facilityProviderFacilityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilityProviderFacilityIdUndefined: Self = StObject.set(x, "facilityProviderFacilityId", js.undefined)
    
    @scala.inline
    def setFacilityProviderUndefined: Self = StObject.set(x, "facilityProvider", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPeeringdbFacilityId(value: String): Self = StObject.set(x, "peeringdbFacilityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeringdbFacilityIdUndefined: Self = StObject.set(x, "peeringdbFacilityId", js.undefined)
    
    @scala.inline
    def setRegionInfos(value: js.Array[SchemaInterconnectLocationRegionInfo]): Self = StObject.set(x, "regionInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionInfosUndefined: Self = StObject.set(x, "regionInfos", js.undefined)
    
    @scala.inline
    def setRegionInfosVarargs(value: SchemaInterconnectLocationRegionInfo*): Self = StObject.set(x, "regionInfos", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
