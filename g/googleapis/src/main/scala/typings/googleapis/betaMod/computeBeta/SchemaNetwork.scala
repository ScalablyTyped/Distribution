package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetwork extends StObject {
  
  /**
    * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
    */
  var IPv4Range: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
    */
  var autoCreateSubnetworks: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this field when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
    */
  var enableUlaInternalIpv6: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] URL of the firewall policy the network is associated with.
    */
  var firewallPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The gateway address for default routing out of the network, selected by GCP.
    */
  var gatewayIPv4: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
    */
  var internalIpv6Range: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#network for networks.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
    */
  var mtu: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
    */
  var networkFirewallPolicyEnforcementOrder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A list of network peerings for the resource.
    */
  var peerings: js.UndefOr[js.Array[SchemaNetworkPeering]] = js.undefined
  
  /**
    * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
    */
  var routingConfig: js.UndefOr[SchemaNetworkRoutingConfig] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.
    */
  var subnetworks: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaNetwork {
  
  inline def apply(): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetwork]
  }
  
  extension [Self <: SchemaNetwork](x: Self) {
    
    inline def setAutoCreateSubnetworks(value: Boolean): Self = StObject.set(x, "autoCreateSubnetworks", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateSubnetworksNull: Self = StObject.set(x, "autoCreateSubnetworks", null)
    
    inline def setAutoCreateSubnetworksUndefined: Self = StObject.set(x, "autoCreateSubnetworks", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableUlaInternalIpv6(value: Boolean): Self = StObject.set(x, "enableUlaInternalIpv6", value.asInstanceOf[js.Any])
    
    inline def setEnableUlaInternalIpv6Null: Self = StObject.set(x, "enableUlaInternalIpv6", null)
    
    inline def setEnableUlaInternalIpv6Undefined: Self = StObject.set(x, "enableUlaInternalIpv6", js.undefined)
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyNull: Self = StObject.set(x, "firewallPolicy", null)
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setGatewayIPv4(value: String): Self = StObject.set(x, "gatewayIPv4", value.asInstanceOf[js.Any])
    
    inline def setGatewayIPv4Null: Self = StObject.set(x, "gatewayIPv4", null)
    
    inline def setGatewayIPv4Undefined: Self = StObject.set(x, "gatewayIPv4", js.undefined)
    
    inline def setIPv4Range(value: String): Self = StObject.set(x, "IPv4Range", value.asInstanceOf[js.Any])
    
    inline def setIPv4RangeNull: Self = StObject.set(x, "IPv4Range", null)
    
    inline def setIPv4RangeUndefined: Self = StObject.set(x, "IPv4Range", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalIpv6Range(value: String): Self = StObject.set(x, "internalIpv6Range", value.asInstanceOf[js.Any])
    
    inline def setInternalIpv6RangeNull: Self = StObject.set(x, "internalIpv6Range", null)
    
    inline def setInternalIpv6RangeUndefined: Self = StObject.set(x, "internalIpv6Range", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMtu(value: Double): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    inline def setMtuNull: Self = StObject.set(x, "mtu", null)
    
    inline def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkFirewallPolicyEnforcementOrder(value: String): Self = StObject.set(x, "networkFirewallPolicyEnforcementOrder", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallPolicyEnforcementOrderNull: Self = StObject.set(x, "networkFirewallPolicyEnforcementOrder", null)
    
    inline def setNetworkFirewallPolicyEnforcementOrderUndefined: Self = StObject.set(x, "networkFirewallPolicyEnforcementOrder", js.undefined)
    
    inline def setPeerings(value: js.Array[SchemaNetworkPeering]): Self = StObject.set(x, "peerings", value.asInstanceOf[js.Any])
    
    inline def setPeeringsUndefined: Self = StObject.set(x, "peerings", js.undefined)
    
    inline def setPeeringsVarargs(value: SchemaNetworkPeering*): Self = StObject.set(x, "peerings", js.Array(value*))
    
    inline def setRoutingConfig(value: SchemaNetworkRoutingConfig): Self = StObject.set(x, "routingConfig", value.asInstanceOf[js.Any])
    
    inline def setRoutingConfigUndefined: Self = StObject.set(x, "routingConfig", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setSubnetworks(value: js.Array[String]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    inline def setSubnetworksNull: Self = StObject.set(x, "subnetworks", null)
    
    inline def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    inline def setSubnetworksVarargs(value: String*): Self = StObject.set(x, "subnetworks", js.Array(value*))
  }
}
