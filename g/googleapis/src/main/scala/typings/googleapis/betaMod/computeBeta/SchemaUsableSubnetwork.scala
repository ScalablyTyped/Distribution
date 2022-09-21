package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsableSubnetwork extends StObject {
  
  /**
    * [Output Only] The external IPv6 address range that is assigned to this subnetwork.
    */
  var externalIpv6Prefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The internal IPv6 address range that is assigned to this subnetwork.
    */
  var internalIpv6Prefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The range of internal addresses that are owned by this subnetwork.
    */
  var ipCidrRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack.
    */
  var ipv6AccessType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network URL.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
    */
  var purpose: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Secondary IP ranges.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaUsableSubnetworkSecondaryRange]] = js.undefined
  
  /**
    * The stack type for the subnet. If set to IPV4_ONLY, new VMs in the subnet are assigned IPv4 addresses only. If set to IPV4_IPV6, new VMs in the subnet can be assigned both IPv4 and IPv6 addresses. If not specified, IPV4_ONLY is used. This field can be both set at resource creation time and updated using patch.
    */
  var stackType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subnetwork URL.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaUsableSubnetwork {
  
  inline def apply(): SchemaUsableSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsableSubnetwork]
  }
  
  extension [Self <: SchemaUsableSubnetwork](x: Self) {
    
    inline def setExternalIpv6Prefix(value: String): Self = StObject.set(x, "externalIpv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setExternalIpv6PrefixNull: Self = StObject.set(x, "externalIpv6Prefix", null)
    
    inline def setExternalIpv6PrefixUndefined: Self = StObject.set(x, "externalIpv6Prefix", js.undefined)
    
    inline def setInternalIpv6Prefix(value: String): Self = StObject.set(x, "internalIpv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setInternalIpv6PrefixNull: Self = StObject.set(x, "internalIpv6Prefix", null)
    
    inline def setInternalIpv6PrefixUndefined: Self = StObject.set(x, "internalIpv6Prefix", js.undefined)
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeNull: Self = StObject.set(x, "ipCidrRange", null)
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setIpv6AccessType(value: String): Self = StObject.set(x, "ipv6AccessType", value.asInstanceOf[js.Any])
    
    inline def setIpv6AccessTypeNull: Self = StObject.set(x, "ipv6AccessType", null)
    
    inline def setIpv6AccessTypeUndefined: Self = StObject.set(x, "ipv6AccessType", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeNull: Self = StObject.set(x, "purpose", null)
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecondaryIpRanges(value: js.Array[SchemaUsableSubnetworkSecondaryRange]): Self = StObject.set(x, "secondaryIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIpRangesUndefined: Self = StObject.set(x, "secondaryIpRanges", js.undefined)
    
    inline def setSecondaryIpRangesVarargs(value: SchemaUsableSubnetworkSecondaryRange*): Self = StObject.set(x, "secondaryIpRanges", js.Array(value*))
    
    inline def setStackType(value: String): Self = StObject.set(x, "stackType", value.asInstanceOf[js.Any])
    
    inline def setStackTypeNull: Self = StObject.set(x, "stackType", null)
    
    inline def setStackTypeUndefined: Self = StObject.set(x, "stackType", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
