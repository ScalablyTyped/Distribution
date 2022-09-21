package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterNat extends StObject {
  
  /**
    * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
    */
  var drainNatIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, - Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be allocated to a VM from this NAT config.
    */
  var enableDynamicPortAllocation: js.UndefOr[Boolean | Null] = js.undefined
  
  var enableEndpointIndependentMapping: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of NAT-ted endpoint types supported by the Nat Gateway. If the list is empty, then it will be equivalent to include ENDPOINT_TYPE_VM
    */
  var endpointTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
    */
  var icmpIdleTimeoutSec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Configure logging on this NAT.
    */
  var logConfig: js.UndefOr[SchemaRouterNatLogConfig] = js.undefined
  
  /**
    * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port Allocation is enabled, and this field is set, it must be set to a power of two greater than minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
    */
  var maxPortsPerVm: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
    */
  var minPortsPerVm: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
    */
  var natIpAllocateOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
    */
  var natIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of rules associated with this NAT.
    */
  var rules: js.UndefOr[js.Array[SchemaRouterNatRule]] = js.undefined
  
  /**
    * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
    */
  var sourceSubnetworkIpRangesToNat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaRouterNatSubnetworkToNat]] = js.undefined
  
  /**
    * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
    */
  var tcpEstablishedIdleTimeoutSec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not set.
    */
  var tcpTimeWaitTimeoutSec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
    */
  var tcpTransitoryIdleTimeoutSec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Indicates whether this NAT is used for public or private IP translation. If unspecified, it defaults to PUBLIC.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
    */
  var udpIdleTimeoutSec: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRouterNat {
  
  inline def apply(): SchemaRouterNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNat]
  }
  
  extension [Self <: SchemaRouterNat](x: Self) {
    
    inline def setDrainNatIps(value: js.Array[String]): Self = StObject.set(x, "drainNatIps", value.asInstanceOf[js.Any])
    
    inline def setDrainNatIpsNull: Self = StObject.set(x, "drainNatIps", null)
    
    inline def setDrainNatIpsUndefined: Self = StObject.set(x, "drainNatIps", js.undefined)
    
    inline def setDrainNatIpsVarargs(value: String*): Self = StObject.set(x, "drainNatIps", js.Array(value*))
    
    inline def setEnableDynamicPortAllocation(value: Boolean): Self = StObject.set(x, "enableDynamicPortAllocation", value.asInstanceOf[js.Any])
    
    inline def setEnableDynamicPortAllocationNull: Self = StObject.set(x, "enableDynamicPortAllocation", null)
    
    inline def setEnableDynamicPortAllocationUndefined: Self = StObject.set(x, "enableDynamicPortAllocation", js.undefined)
    
    inline def setEnableEndpointIndependentMapping(value: Boolean): Self = StObject.set(x, "enableEndpointIndependentMapping", value.asInstanceOf[js.Any])
    
    inline def setEnableEndpointIndependentMappingNull: Self = StObject.set(x, "enableEndpointIndependentMapping", null)
    
    inline def setEnableEndpointIndependentMappingUndefined: Self = StObject.set(x, "enableEndpointIndependentMapping", js.undefined)
    
    inline def setEndpointTypes(value: js.Array[String]): Self = StObject.set(x, "endpointTypes", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypesNull: Self = StObject.set(x, "endpointTypes", null)
    
    inline def setEndpointTypesUndefined: Self = StObject.set(x, "endpointTypes", js.undefined)
    
    inline def setEndpointTypesVarargs(value: String*): Self = StObject.set(x, "endpointTypes", js.Array(value*))
    
    inline def setIcmpIdleTimeoutSec(value: Double): Self = StObject.set(x, "icmpIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setIcmpIdleTimeoutSecNull: Self = StObject.set(x, "icmpIdleTimeoutSec", null)
    
    inline def setIcmpIdleTimeoutSecUndefined: Self = StObject.set(x, "icmpIdleTimeoutSec", js.undefined)
    
    inline def setLogConfig(value: SchemaRouterNatLogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setMaxPortsPerVm(value: Double): Self = StObject.set(x, "maxPortsPerVm", value.asInstanceOf[js.Any])
    
    inline def setMaxPortsPerVmNull: Self = StObject.set(x, "maxPortsPerVm", null)
    
    inline def setMaxPortsPerVmUndefined: Self = StObject.set(x, "maxPortsPerVm", js.undefined)
    
    inline def setMinPortsPerVm(value: Double): Self = StObject.set(x, "minPortsPerVm", value.asInstanceOf[js.Any])
    
    inline def setMinPortsPerVmNull: Self = StObject.set(x, "minPortsPerVm", null)
    
    inline def setMinPortsPerVmUndefined: Self = StObject.set(x, "minPortsPerVm", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNatIpAllocateOption(value: String): Self = StObject.set(x, "natIpAllocateOption", value.asInstanceOf[js.Any])
    
    inline def setNatIpAllocateOptionNull: Self = StObject.set(x, "natIpAllocateOption", null)
    
    inline def setNatIpAllocateOptionUndefined: Self = StObject.set(x, "natIpAllocateOption", js.undefined)
    
    inline def setNatIps(value: js.Array[String]): Self = StObject.set(x, "natIps", value.asInstanceOf[js.Any])
    
    inline def setNatIpsNull: Self = StObject.set(x, "natIps", null)
    
    inline def setNatIpsUndefined: Self = StObject.set(x, "natIps", js.undefined)
    
    inline def setNatIpsVarargs(value: String*): Self = StObject.set(x, "natIps", js.Array(value*))
    
    inline def setRules(value: js.Array[SchemaRouterNatRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaRouterNatRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setSourceSubnetworkIpRangesToNat(value: String): Self = StObject.set(x, "sourceSubnetworkIpRangesToNat", value.asInstanceOf[js.Any])
    
    inline def setSourceSubnetworkIpRangesToNatNull: Self = StObject.set(x, "sourceSubnetworkIpRangesToNat", null)
    
    inline def setSourceSubnetworkIpRangesToNatUndefined: Self = StObject.set(x, "sourceSubnetworkIpRangesToNat", js.undefined)
    
    inline def setSubnetworks(value: js.Array[SchemaRouterNatSubnetworkToNat]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    inline def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    inline def setSubnetworksVarargs(value: SchemaRouterNatSubnetworkToNat*): Self = StObject.set(x, "subnetworks", js.Array(value*))
    
    inline def setTcpEstablishedIdleTimeoutSec(value: Double): Self = StObject.set(x, "tcpEstablishedIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTcpEstablishedIdleTimeoutSecNull: Self = StObject.set(x, "tcpEstablishedIdleTimeoutSec", null)
    
    inline def setTcpEstablishedIdleTimeoutSecUndefined: Self = StObject.set(x, "tcpEstablishedIdleTimeoutSec", js.undefined)
    
    inline def setTcpTimeWaitTimeoutSec(value: Double): Self = StObject.set(x, "tcpTimeWaitTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTcpTimeWaitTimeoutSecNull: Self = StObject.set(x, "tcpTimeWaitTimeoutSec", null)
    
    inline def setTcpTimeWaitTimeoutSecUndefined: Self = StObject.set(x, "tcpTimeWaitTimeoutSec", js.undefined)
    
    inline def setTcpTransitoryIdleTimeoutSec(value: Double): Self = StObject.set(x, "tcpTransitoryIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTcpTransitoryIdleTimeoutSecNull: Self = StObject.set(x, "tcpTransitoryIdleTimeoutSec", null)
    
    inline def setTcpTransitoryIdleTimeoutSecUndefined: Self = StObject.set(x, "tcpTransitoryIdleTimeoutSec", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUdpIdleTimeoutSec(value: Double): Self = StObject.set(x, "udpIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setUdpIdleTimeoutSecNull: Self = StObject.set(x, "udpIdleTimeoutSec", null)
    
    inline def setUdpIdleTimeoutSecUndefined: Self = StObject.set(x, "udpIdleTimeoutSec", js.undefined)
  }
}
