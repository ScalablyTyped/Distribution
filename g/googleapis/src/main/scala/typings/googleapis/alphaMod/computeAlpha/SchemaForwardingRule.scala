package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForwardingRule extends StObject {
  
  /**
    * IP address for which this forwarding rule accepts traffic. When a client sends traffic to this IP address, the forwarding rule directs the traffic to the referenced target or backendService. While creating a forwarding rule, specifying an IPAddress is required under the following circumstances: - When the target is set to targetGrpcProxy and validateForProxyless is set to true, the IPAddress should be set to 0.0.0.0. - When the target is a Private Service Connect Google APIs bundle, you must specify an IPAddress. Otherwise, you can optionally specify an IP address that references an existing static (reserved) IP address resource. When omitted, Google Cloud assigns an ephemeral IP address. Use one of the following formats to specify an IP address while creating a forwarding rule: * IP address number, as in `100.1.2.3` * Full resource URL, as in https://www.googleapis.com/compute/v1/projects/project_id/regions/region /addresses/address-name * Partial URL or by name, as in: - projects/project_id/regions/region/addresses/address-name - regions/region/addresses/address-name - global/addresses/address-name - address-name The forwarding rule's target or backendService, and in most cases, also the loadBalancingScheme, determine the type of IP address that you can use. For detailed information, see [IP address specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#ip_address_specifications). When reading an IPAddress, the API always returns the IP address number.
    */
  var IPAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP protocol to which this rule applies. For protocol forwarding, valid options are TCP, UDP, ESP, AH, SCTP, ICMP and L3_DEFAULT. The valid IP protocols are different for different load balancing products as described in [Load balancing features](https://cloud.google.com/load-balancing/docs/features#protocols_from_the_load_balancer_to_the_backends).
    */
  var IPProtocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is used along with the backend_service field for Internal TCP/UDP Load Balancing or Network Load Balancing, or with the target field for internal and external TargetInstance. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. For TCP, UDP and SCTP traffic, packets addressed to any ports will be forwarded to the target or backendService.
    */
  var allPorts: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This field is used along with the backend_service field for internal load balancing or with the target field for internal TargetInstance. If the field is set to TRUE, clients can access ILB from all regions. Otherwise only allows access from clients in the same region as the internal load balancer.
    */
  var allowGlobalAccess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This is used in PSC consumer ForwardingRule to control whether the PSC endpoint can be accessed from another region.
    */
  var allowPscGlobalAccess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies the backend service to which the forwarding rule sends traffic. Required for Internal TCP/UDP Load Balancing and Network Load Balancing; must be omitted for all other load balancer types.
    */
  var backendService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ForwardingRule. Include the fingerprint in patch request to ensure that you do not overwrite changes that were applied from another concurrent request. To see the latest fingerprint, make a get() request to retrieve a ForwardingRule.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6.
    */
  var ipVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether or not this load balancer can be used as a collector for packet mirroring. To prevent mirroring loops, instances behind this load balancer will not have their traffic mirrored even if a PacketMirroring rule applies to them. This can only be set to true for load balancers that have their loadBalancingScheme set to INTERNAL.
    */
  var isMirroringCollector: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#forwardingRule for Forwarding Rule resources.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A fingerprint for the labels being applied to this resource, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a ForwardingRule.
    */
  var labelFingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Specifies the forwarding rule type. For more information about forwarding rules, refer to Forwarding rule concepts.
    */
  var loadBalancingScheme: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Opaque filter criteria used by load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to load balancer, xDS clients present node metadata. When there is a match, the relevant configuration is made available to those proxies. Otherwise, all the resources (e.g. TargetHttpProxy, UrlMap) referenced by the ForwardingRule are not visible to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here will be applifed before those specified in the UrlMap that this ForwardingRule references. metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    */
  var metadataFilters: js.UndefOr[js.Array[SchemaMetadataFilter]] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. For Private Service Connect forwarding rules that forward traffic to Google APIs, the forwarding rule name must be a 1-20 characters string with lowercase letters and numbers and must start with a letter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is not used for external load balancing. For Internal TCP/UDP Load Balancing, this field identifies the network that the load balanced IP should belong to for this Forwarding Rule. If this field is not specified, the default network will be used. For Private Service Connect forwarding rules that forward traffic to Google APIs, a network must be provided.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This signifies the networking tier used for configuring this load balancer and can only take the following values: PREMIUM, STANDARD. For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For GlobalForwardingRule, the valid value is PREMIUM. If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this value must be equal to the networkTier of the Address.
    */
  var networkTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is used in PSC consumer ForwardingRule to control whether it should try to auto-generate a DNS zone or not. Non-PSC forwarding rules do not use this field.
    */
  var noAutomateDnsZone: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This field can be used only if: - Load balancing scheme is one of EXTERNAL, INTERNAL_SELF_MANAGED or INTERNAL_MANAGED - IPProtocol is one of TCP, UDP, or SCTP. Packets addressed to ports in the specified range will be forwarded to target or backend_service. You can only use one of ports, port_range, or allPorts. The three are mutually exclusive. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. Some types of forwarding target have constraints on the acceptable ports. For more information, see [Port specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications). @pattern: \\d+(?:-\\d+)?
    */
  var portRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ports field is only supported when the forwarding rule references a backend_service directly. Only packets addressed to the [specified list of ports]((https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications)) are forwarded to backends. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. You can specify a list of up to five ports, which can be non-contiguous. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. @pattern: \\d+(?:-\\d+)?
    */
  var ports: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Output Only] The PSC connection id of the PSC Forwarding Rule.
    */
  var pscConnectionId: js.UndefOr[String | Null] = js.undefined
  
  var pscConnectionStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] URL of the region where the regional forwarding rule resides. This field is not applicable to global forwarding rules. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Service Directory resources to register this forwarding rule with. Currently, only supports a single Service Directory resource.
    */
  var serviceDirectoryRegistrations: js.UndefOr[js.Array[SchemaForwardingRuleServiceDirectoryRegistration]] = js.undefined
  
  /**
    * An optional prefix to the service name for this Forwarding Rule. If specified, the prefix is the first label of the fully qualified service name. The label must be 1-63 characters long, and comply with RFC1035. Specifically, the label must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. This field is only used for internal load balancing.
    */
  var serviceLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The internal fully qualified service name for this Forwarding Rule. This field is only used for internal load balancing.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If not empty, this Forwarding Rule will only forward the traffic when the source IP address matches one of the IP addresses or CIDR ranges set here. Note that a Forwarding Rule can only have up to 64 source IP ranges, and this field can only be used with a regional Forwarding Rule whose scheme is EXTERNAL. Each source_ip_range entry should be either an IP address (for example, 1.2.3.4) or a CIDR range (for example, 1.2.3.0/24).
    */
  var sourceIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This field identifies the subnetwork that the load balanced IP should belong to for this Forwarding Rule, used in internal load balancing and network load balancing with IPv6. If the network specified is in auto subnet mode, this field is optional. However, a subnetwork must be specified if the network is in custom subnet mode or when creating external forwarding rule with IPv6.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
  
  var target: js.UndefOr[String | Null] = js.undefined
}
object SchemaForwardingRule {
  
  inline def apply(): SchemaForwardingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRule]
  }
  
  extension [Self <: SchemaForwardingRule](x: Self) {
    
    inline def setAllPorts(value: Boolean): Self = StObject.set(x, "allPorts", value.asInstanceOf[js.Any])
    
    inline def setAllPortsNull: Self = StObject.set(x, "allPorts", null)
    
    inline def setAllPortsUndefined: Self = StObject.set(x, "allPorts", js.undefined)
    
    inline def setAllowGlobalAccess(value: Boolean): Self = StObject.set(x, "allowGlobalAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowGlobalAccessNull: Self = StObject.set(x, "allowGlobalAccess", null)
    
    inline def setAllowGlobalAccessUndefined: Self = StObject.set(x, "allowGlobalAccess", js.undefined)
    
    inline def setAllowPscGlobalAccess(value: Boolean): Self = StObject.set(x, "allowPscGlobalAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowPscGlobalAccessNull: Self = StObject.set(x, "allowPscGlobalAccess", null)
    
    inline def setAllowPscGlobalAccessUndefined: Self = StObject.set(x, "allowPscGlobalAccess", js.undefined)
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceNull: Self = StObject.set(x, "backendService", null)
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setIPAddress(value: String): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPAddressNull: Self = StObject.set(x, "IPAddress", null)
    
    inline def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    inline def setIPProtocol(value: String): Self = StObject.set(x, "IPProtocol", value.asInstanceOf[js.Any])
    
    inline def setIPProtocolNull: Self = StObject.set(x, "IPProtocol", null)
    
    inline def setIPProtocolUndefined: Self = StObject.set(x, "IPProtocol", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpVersion(value: String): Self = StObject.set(x, "ipVersion", value.asInstanceOf[js.Any])
    
    inline def setIpVersionNull: Self = StObject.set(x, "ipVersion", null)
    
    inline def setIpVersionUndefined: Self = StObject.set(x, "ipVersion", js.undefined)
    
    inline def setIsMirroringCollector(value: Boolean): Self = StObject.set(x, "isMirroringCollector", value.asInstanceOf[js.Any])
    
    inline def setIsMirroringCollectorNull: Self = StObject.set(x, "isMirroringCollector", null)
    
    inline def setIsMirroringCollectorUndefined: Self = StObject.set(x, "isMirroringCollector", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    inline def setLabelFingerprintNull: Self = StObject.set(x, "labelFingerprint", null)
    
    inline def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLoadBalancingScheme(value: String): Self = StObject.set(x, "loadBalancingScheme", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingSchemeNull: Self = StObject.set(x, "loadBalancingScheme", null)
    
    inline def setLoadBalancingSchemeUndefined: Self = StObject.set(x, "loadBalancingScheme", js.undefined)
    
    inline def setMetadataFilters(value: js.Array[SchemaMetadataFilter]): Self = StObject.set(x, "metadataFilters", value.asInstanceOf[js.Any])
    
    inline def setMetadataFiltersUndefined: Self = StObject.set(x, "metadataFilters", js.undefined)
    
    inline def setMetadataFiltersVarargs(value: SchemaMetadataFilter*): Self = StObject.set(x, "metadataFilters", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    inline def setNetworkTierNull: Self = StObject.set(x, "networkTier", null)
    
    inline def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNoAutomateDnsZone(value: Boolean): Self = StObject.set(x, "noAutomateDnsZone", value.asInstanceOf[js.Any])
    
    inline def setNoAutomateDnsZoneNull: Self = StObject.set(x, "noAutomateDnsZone", null)
    
    inline def setNoAutomateDnsZoneUndefined: Self = StObject.set(x, "noAutomateDnsZone", js.undefined)
    
    inline def setPortRange(value: String): Self = StObject.set(x, "portRange", value.asInstanceOf[js.Any])
    
    inline def setPortRangeNull: Self = StObject.set(x, "portRange", null)
    
    inline def setPortRangeUndefined: Self = StObject.set(x, "portRange", js.undefined)
    
    inline def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsNull: Self = StObject.set(x, "ports", null)
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setPscConnectionId(value: String): Self = StObject.set(x, "pscConnectionId", value.asInstanceOf[js.Any])
    
    inline def setPscConnectionIdNull: Self = StObject.set(x, "pscConnectionId", null)
    
    inline def setPscConnectionIdUndefined: Self = StObject.set(x, "pscConnectionId", js.undefined)
    
    inline def setPscConnectionStatus(value: String): Self = StObject.set(x, "pscConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setPscConnectionStatusNull: Self = StObject.set(x, "pscConnectionStatus", null)
    
    inline def setPscConnectionStatusUndefined: Self = StObject.set(x, "pscConnectionStatus", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setServiceDirectoryRegistrations(value: js.Array[SchemaForwardingRuleServiceDirectoryRegistration]): Self = StObject.set(x, "serviceDirectoryRegistrations", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryRegistrationsUndefined: Self = StObject.set(x, "serviceDirectoryRegistrations", js.undefined)
    
    inline def setServiceDirectoryRegistrationsVarargs(value: SchemaForwardingRuleServiceDirectoryRegistration*): Self = StObject.set(x, "serviceDirectoryRegistrations", js.Array(value*))
    
    inline def setServiceLabel(value: String): Self = StObject.set(x, "serviceLabel", value.asInstanceOf[js.Any])
    
    inline def setServiceLabelNull: Self = StObject.set(x, "serviceLabel", null)
    
    inline def setServiceLabelUndefined: Self = StObject.set(x, "serviceLabel", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setSourceIpRanges(value: js.Array[String]): Self = StObject.set(x, "sourceIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSourceIpRangesNull: Self = StObject.set(x, "sourceIpRanges", null)
    
    inline def setSourceIpRangesUndefined: Self = StObject.set(x, "sourceIpRanges", js.undefined)
    
    inline def setSourceIpRangesVarargs(value: String*): Self = StObject.set(x, "sourceIpRanges", js.Array(value*))
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
