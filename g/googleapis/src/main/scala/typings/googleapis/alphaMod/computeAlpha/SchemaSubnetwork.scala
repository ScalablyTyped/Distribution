package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubnetwork extends StObject {
  
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled. Sets the aggregation interval for collecting flow logs. Increasing the interval time reduces the amount of generated flow logs for long-lasting connections. Default is an interval of 5 seconds per connection. Valid values: INTERVAL_5_SEC, INTERVAL_30_SEC, INTERVAL_1_MIN, INTERVAL_5_MIN, INTERVAL_10_MIN, INTERVAL_15_MIN.
    */
  var aggregationInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this subnetwork's ranges can conflict with existing static routes. Setting this to true allows this subnetwork's primary and secondary ranges to overlap with (and contain) static routes that have already been configured on the corresponding network. For example if a static route has range 10.1.0.0/16, a subnet range 10.0.0.0/8 could only be created if allow_conflicting_routes=true. Overlapping is only allowed on subnetwork operations; routes whose ranges conflict with this subnetwork's ranges won't be allowed unless route.allow_conflicting_subnetworks is set to true. Typically packets destined to IPs within the subnetwork (which may contain private/sensitive data) are prevented from leaving the virtual network. Setting this field to true will disable this feature. The default value is false and applies to all existing subnetworks and automatically created subnetworks. This field cannot be set to true at resource creation time.
    */
  var allowSubnetCidrRoutesOverlap: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
    */
  var enableFlowLogs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enables Layer2 communication on the subnetwork.
    */
  var enableL2: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Deprecated in favor of enable in PrivateIpv6GoogleAccess. Whether the VMs in this subnet can directly access Google services via internal IPv6 addresses. This field can be both set at resource creation time and updated using patch.
    */
  var enablePrivateV6Access: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] The external IPv6 address range that is assigned to this subnetwork.
    */
  var externalIpv6Prefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
    */
  var flowSampling: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The gateway address for default routes to reach destination addresses outside this subnetwork.
    */
  var gatewayAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The internal IPv6 address range that is assigned to this subnetwork.
    */
  var internalIpv6Prefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
    */
  var ipCidrRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack.
    */
  var ipv6AccessType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] This field is for internal use.
    */
  var ipv6CidrRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
    */
  var logConfig: js.UndefOr[SchemaSubnetworkLogConfig] = js.undefined
  
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled. Configures whether metadata fields should be added to the reported VPC flow logs. Options are INCLUDE_ALL_METADATA, EXCLUDE_ALL_METADATA, and CUSTOM_METADATA. Default is EXCLUDE_ALL_METADATA.
    */
  var metadata: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
    */
  var privateIpGoogleAccess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This field is for internal use. This field can be both set at resource creation time and updated using patch.
    */
  var privateIpv6GoogleAccess: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
    */
  var purpose: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the reserved internal range.
    */
  var reservedInternalRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaSubnetworkSecondaryRange]] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stack type for the subnet. If set to IPV4_ONLY, new VMs in the subnet are assigned IPv4 addresses only. If set to IPV4_IPV6, new VMs in the subnet can be assigned both IPv4 and IPv6 addresses. If not specified, IPV4_ONLY is used. This field can be both set at resource creation time and updated using patch.
    */
  var stackType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The state of the subnetwork, which can be one of the following values: READY: Subnetwork is created and ready to use DRAINING: only applicable to subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be used or modified until it reaches a status of READY
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A repeated field indicating the VLAN IDs supported on this subnetwork. During Subnet creation, specifying vlan is valid only if enable_l2 is true. During Subnet Update, specifying vlan is allowed only for l2 enabled subnets. Restricted to only one VLAN.
    */
  var vlans: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaSubnetwork {
  
  inline def apply(): SchemaSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetwork]
  }
  
  extension [Self <: SchemaSubnetwork](x: Self) {
    
    inline def setAggregationInterval(value: String): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setAggregationIntervalNull: Self = StObject.set(x, "aggregationInterval", null)
    
    inline def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    inline def setAllowSubnetCidrRoutesOverlap(value: Boolean): Self = StObject.set(x, "allowSubnetCidrRoutesOverlap", value.asInstanceOf[js.Any])
    
    inline def setAllowSubnetCidrRoutesOverlapNull: Self = StObject.set(x, "allowSubnetCidrRoutesOverlap", null)
    
    inline def setAllowSubnetCidrRoutesOverlapUndefined: Self = StObject.set(x, "allowSubnetCidrRoutesOverlap", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableFlowLogs(value: Boolean): Self = StObject.set(x, "enableFlowLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableFlowLogsNull: Self = StObject.set(x, "enableFlowLogs", null)
    
    inline def setEnableFlowLogsUndefined: Self = StObject.set(x, "enableFlowLogs", js.undefined)
    
    inline def setEnableL2(value: Boolean): Self = StObject.set(x, "enableL2", value.asInstanceOf[js.Any])
    
    inline def setEnableL2Null: Self = StObject.set(x, "enableL2", null)
    
    inline def setEnableL2Undefined: Self = StObject.set(x, "enableL2", js.undefined)
    
    inline def setEnablePrivateV6Access(value: Boolean): Self = StObject.set(x, "enablePrivateV6Access", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivateV6AccessNull: Self = StObject.set(x, "enablePrivateV6Access", null)
    
    inline def setEnablePrivateV6AccessUndefined: Self = StObject.set(x, "enablePrivateV6Access", js.undefined)
    
    inline def setExternalIpv6Prefix(value: String): Self = StObject.set(x, "externalIpv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setExternalIpv6PrefixNull: Self = StObject.set(x, "externalIpv6Prefix", null)
    
    inline def setExternalIpv6PrefixUndefined: Self = StObject.set(x, "externalIpv6Prefix", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setFlowSampling(value: Double): Self = StObject.set(x, "flowSampling", value.asInstanceOf[js.Any])
    
    inline def setFlowSamplingNull: Self = StObject.set(x, "flowSampling", null)
    
    inline def setFlowSamplingUndefined: Self = StObject.set(x, "flowSampling", js.undefined)
    
    inline def setGatewayAddress(value: String): Self = StObject.set(x, "gatewayAddress", value.asInstanceOf[js.Any])
    
    inline def setGatewayAddressNull: Self = StObject.set(x, "gatewayAddress", null)
    
    inline def setGatewayAddressUndefined: Self = StObject.set(x, "gatewayAddress", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalIpv6Prefix(value: String): Self = StObject.set(x, "internalIpv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setInternalIpv6PrefixNull: Self = StObject.set(x, "internalIpv6Prefix", null)
    
    inline def setInternalIpv6PrefixUndefined: Self = StObject.set(x, "internalIpv6Prefix", js.undefined)
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeNull: Self = StObject.set(x, "ipCidrRange", null)
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setIpv6AccessType(value: String): Self = StObject.set(x, "ipv6AccessType", value.asInstanceOf[js.Any])
    
    inline def setIpv6AccessTypeNull: Self = StObject.set(x, "ipv6AccessType", null)
    
    inline def setIpv6AccessTypeUndefined: Self = StObject.set(x, "ipv6AccessType", js.undefined)
    
    inline def setIpv6CidrRange(value: String): Self = StObject.set(x, "ipv6CidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrRangeNull: Self = StObject.set(x, "ipv6CidrRange", null)
    
    inline def setIpv6CidrRangeUndefined: Self = StObject.set(x, "ipv6CidrRange", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLogConfig(value: SchemaSubnetworkLogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPrivateIpGoogleAccess(value: Boolean): Self = StObject.set(x, "privateIpGoogleAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpGoogleAccessNull: Self = StObject.set(x, "privateIpGoogleAccess", null)
    
    inline def setPrivateIpGoogleAccessUndefined: Self = StObject.set(x, "privateIpGoogleAccess", js.undefined)
    
    inline def setPrivateIpv6GoogleAccess(value: String): Self = StObject.set(x, "privateIpv6GoogleAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv6GoogleAccessNull: Self = StObject.set(x, "privateIpv6GoogleAccess", null)
    
    inline def setPrivateIpv6GoogleAccessUndefined: Self = StObject.set(x, "privateIpv6GoogleAccess", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeNull: Self = StObject.set(x, "purpose", null)
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setReservedInternalRange(value: String): Self = StObject.set(x, "reservedInternalRange", value.asInstanceOf[js.Any])
    
    inline def setReservedInternalRangeNull: Self = StObject.set(x, "reservedInternalRange", null)
    
    inline def setReservedInternalRangeUndefined: Self = StObject.set(x, "reservedInternalRange", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecondaryIpRanges(value: js.Array[SchemaSubnetworkSecondaryRange]): Self = StObject.set(x, "secondaryIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIpRangesUndefined: Self = StObject.set(x, "secondaryIpRanges", js.undefined)
    
    inline def setSecondaryIpRangesVarargs(value: SchemaSubnetworkSecondaryRange*): Self = StObject.set(x, "secondaryIpRanges", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setStackType(value: String): Self = StObject.set(x, "stackType", value.asInstanceOf[js.Any])
    
    inline def setStackTypeNull: Self = StObject.set(x, "stackType", null)
    
    inline def setStackTypeUndefined: Self = StObject.set(x, "stackType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVlans(value: js.Array[Double]): Self = StObject.set(x, "vlans", value.asInstanceOf[js.Any])
    
    inline def setVlansNull: Self = StObject.set(x, "vlans", null)
    
    inline def setVlansUndefined: Self = StObject.set(x, "vlans", js.undefined)
    
    inline def setVlansVarargs(value: Double*): Self = StObject.set(x, "vlans", js.Array(value*))
  }
}
