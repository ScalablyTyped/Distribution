package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Network resource. Read Virtual Private Cloud (VPC) Network
  * Overview for more information. (== resource_for v1.networks ==) (==
  * resource_for beta.networks ==)
  */
trait SchemaNetwork extends StObject {
  
  /**
    * Deprecated in favor of subnet mode networks. The range of internal
    * addresses that are legal on this network. This range is a CIDR
    * specification, for example: 192.168.0.0/16. Provided by the client when
    * the network is created.
    */
  var IPv4Range: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true, the VPC network is created in &quot;auto&quot; mode.
    * When set to false, the VPC network is created in &quot;custom&quot; mode.
    * An auto mode VPC network starts with one subnet per region. Each subnet
    * has a predetermined range as described in Auto mode VPC network IP
    * ranges.
    */
  var autoCreateSubnetworks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The gateway address for default routing out of the network.
    * This value is read only and is selected by GCP.
    */
  var gatewayIPv4: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#network for networks.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] A list of network peerings for the resource.
    */
  var peerings: js.UndefOr[js.Array[SchemaNetworkPeering]] = js.undefined
  
  /**
    * The network-level routing configuration for this network. Used by Cloud
    * Router to determine what type of network-wide routing behavior to
    * enforce.
    */
  var routingConfig: js.UndefOr[SchemaNetworkRoutingConfig] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined fully-qualified URLs for all subnetworks in
    * this VPC network.
    */
  var subnetworks: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaNetwork {
  
  @scala.inline
  def apply(): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetwork]
  }
  
  @scala.inline
  implicit class SchemaNetworkMutableBuilder[Self <: SchemaNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCreateSubnetworks(value: Boolean): Self = StObject.set(x, "autoCreateSubnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateSubnetworksUndefined: Self = StObject.set(x, "autoCreateSubnetworks", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGatewayIPv4(value: String): Self = StObject.set(x, "gatewayIPv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIPv4Undefined: Self = StObject.set(x, "gatewayIPv4", js.undefined)
    
    @scala.inline
    def setIPv4Range(value: String): Self = StObject.set(x, "IPv4Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv4RangeUndefined: Self = StObject.set(x, "IPv4Range", js.undefined)
    
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
    def setPeerings(value: js.Array[SchemaNetworkPeering]): Self = StObject.set(x, "peerings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeringsUndefined: Self = StObject.set(x, "peerings", js.undefined)
    
    @scala.inline
    def setPeeringsVarargs(value: SchemaNetworkPeering*): Self = StObject.set(x, "peerings", js.Array(value :_*))
    
    @scala.inline
    def setRoutingConfig(value: SchemaNetworkRoutingConfig): Self = StObject.set(x, "routingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingConfigUndefined: Self = StObject.set(x, "routingConfig", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSubnetworks(value: js.Array[String]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: String*): Self = StObject.set(x, "subnetworks", js.Array(value :_*))
  }
}
