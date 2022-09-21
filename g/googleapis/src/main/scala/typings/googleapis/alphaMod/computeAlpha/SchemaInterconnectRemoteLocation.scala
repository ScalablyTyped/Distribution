package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectRemoteLocation extends StObject {
  
  /**
    * [Output Only] The postal address of the Point of Presence, each line in the address is separated by a newline character.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Subset of fields from InterconnectAttachment's |configurationConstraints| field that apply to all attachments for this remote location.
    */
  var attachmentConfigurationConstraints: js.UndefOr[SchemaInterconnectAttachmentConfigurationConstraints] = js.undefined
  
  /**
    * [Output Only] Metropolitan area designator that indicates which city an interconnect is located. For example: "Chicago, IL", "Amsterdam, Netherlands".
    */
  var city: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Constraints on the parameters for creating Cross-Cloud Interconnect and associated InterconnectAttachments.
    */
  var constraints: js.UndefOr[SchemaInterconnectRemoteLocationConstraints] = js.undefined
  
  /**
    * [Output Only] Continent for this location, which can take one of the following values: - AFRICA - ASIA_PAC - EUROPE - NORTH_AMERICA - SOUTH_AMERICA
    */
  var continent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An optional description of the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The name of the provider for this facility (e.g., EQUINIX).
    */
  var facilityProvider: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A provider-assigned Identifier for this facility (e.g., Ashburn-DC1).
    */
  var facilityProviderFacilityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#interconnectRemoteLocation for interconnect remote locations.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Link Aggregation Control Protocol (LACP) constraints, which can take one of the following values: LACP_SUPPORTED, LACP_UNSUPPORTED
    */
  var lacp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The maximum number of 100 Gbps ports supported in a link aggregation group (LAG). When linkType is 100 Gbps, requestedLinkCount cannot exceed max_lag_size_100_gbps.
    */
  var maxLagSize100Gbps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The peeringdb identifier for this facility (corresponding with a netfac type in peeringdb).
    */
  var peeringdbFacilityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Permitted connections.
    */
  var permittedConnections: js.UndefOr[js.Array[SchemaInterconnectRemoteLocationPermittedConnections]] = js.undefined
  
  /**
    * [Output Only] Indicates the service provider present at the remote location. Example values: "Amazon Web Services", "Microsoft Azure".
    */
  var remoteService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The status of this InterconnectRemoteLocation, which can take one of the following values: - CLOSED: The InterconnectRemoteLocation is closed and is unavailable for provisioning new Cross-Cloud Interconnects. - AVAILABLE: The InterconnectRemoteLocation is available for provisioning new Cross-Cloud Interconnects.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectRemoteLocation {
  
  inline def apply(): SchemaInterconnectRemoteLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectRemoteLocation]
  }
  
  extension [Self <: SchemaInterconnectRemoteLocation](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAttachmentConfigurationConstraints(value: SchemaInterconnectAttachmentConfigurationConstraints): Self = StObject.set(x, "attachmentConfigurationConstraints", value.asInstanceOf[js.Any])
    
    inline def setAttachmentConfigurationConstraintsUndefined: Self = StObject.set(x, "attachmentConfigurationConstraints", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setConstraints(value: SchemaInterconnectRemoteLocationConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    inline def setContinentNull: Self = StObject.set(x, "continent", null)
    
    inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFacilityProvider(value: String): Self = StObject.set(x, "facilityProvider", value.asInstanceOf[js.Any])
    
    inline def setFacilityProviderFacilityId(value: String): Self = StObject.set(x, "facilityProviderFacilityId", value.asInstanceOf[js.Any])
    
    inline def setFacilityProviderFacilityIdNull: Self = StObject.set(x, "facilityProviderFacilityId", null)
    
    inline def setFacilityProviderFacilityIdUndefined: Self = StObject.set(x, "facilityProviderFacilityId", js.undefined)
    
    inline def setFacilityProviderNull: Self = StObject.set(x, "facilityProvider", null)
    
    inline def setFacilityProviderUndefined: Self = StObject.set(x, "facilityProvider", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLacp(value: String): Self = StObject.set(x, "lacp", value.asInstanceOf[js.Any])
    
    inline def setLacpNull: Self = StObject.set(x, "lacp", null)
    
    inline def setLacpUndefined: Self = StObject.set(x, "lacp", js.undefined)
    
    inline def setMaxLagSize100Gbps(value: Double): Self = StObject.set(x, "maxLagSize100Gbps", value.asInstanceOf[js.Any])
    
    inline def setMaxLagSize100GbpsNull: Self = StObject.set(x, "maxLagSize100Gbps", null)
    
    inline def setMaxLagSize100GbpsUndefined: Self = StObject.set(x, "maxLagSize100Gbps", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeeringdbFacilityId(value: String): Self = StObject.set(x, "peeringdbFacilityId", value.asInstanceOf[js.Any])
    
    inline def setPeeringdbFacilityIdNull: Self = StObject.set(x, "peeringdbFacilityId", null)
    
    inline def setPeeringdbFacilityIdUndefined: Self = StObject.set(x, "peeringdbFacilityId", js.undefined)
    
    inline def setPermittedConnections(value: js.Array[SchemaInterconnectRemoteLocationPermittedConnections]): Self = StObject.set(x, "permittedConnections", value.asInstanceOf[js.Any])
    
    inline def setPermittedConnectionsUndefined: Self = StObject.set(x, "permittedConnections", js.undefined)
    
    inline def setPermittedConnectionsVarargs(value: SchemaInterconnectRemoteLocationPermittedConnections*): Self = StObject.set(x, "permittedConnections", js.Array(value*))
    
    inline def setRemoteService(value: String): Self = StObject.set(x, "remoteService", value.asInstanceOf[js.Any])
    
    inline def setRemoteServiceNull: Self = StObject.set(x, "remoteService", null)
    
    inline def setRemoteServiceUndefined: Self = StObject.set(x, "remoteService", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
