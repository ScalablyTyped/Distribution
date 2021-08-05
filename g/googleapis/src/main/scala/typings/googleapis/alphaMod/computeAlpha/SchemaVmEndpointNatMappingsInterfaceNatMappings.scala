package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contain information of Nat mapping for an interface of this endpoint.
  */
trait SchemaVmEndpointNatMappingsInterfaceNatMappings extends StObject {
  
  /**
    * List of all drain IP:port-range mappings assigned to this interface.
    * These ranges are inclusive, that is, both the first and the last ports
    * can be used for NAT. Example: [&quot;2.2.2.2:12345-12355&quot;,
    * &quot;1.1.1.1:2234-2234&quot;].
    */
  var drainNatIpPortRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of all IP:port-range mappings assigned to this interface. These
    * ranges are inclusive, that is, both the first and the last ports can be
    * used for NAT. Example: [&quot;2.2.2.2:12345-12355&quot;,
    * &quot;1.1.1.1:2234-2234&quot;].
    */
  var natIpPortRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Total number of drain ports across all NAT IPs allocated to this
    * interface. It equals to the aggregated port number in the field
    * drain_nat_ip_port_ranges.
    */
  var numTotalDrainNatPorts: js.UndefOr[Double] = js.undefined
  
  /**
    * Total number of ports across all NAT IPs allocated to this interface. It
    * equals to the aggregated port number in the field nat_ip_port_ranges.
    */
  var numTotalNatPorts: js.UndefOr[Double] = js.undefined
  
  /**
    * Alias IP range for this interface endpoint. It will be a private (RFC
    * 1918) IP range. Examples: &quot;10.33.4.55/32&quot;, or
    * &quot;192.168.5.0/24&quot;.
    */
  var sourceAliasIpRange: js.UndefOr[String] = js.undefined
  
  /**
    * Primary IP of the VM for this NIC.
    */
  var sourceVirtualIp: js.UndefOr[String] = js.undefined
}
object SchemaVmEndpointNatMappingsInterfaceNatMappings {
  
  inline def apply(): SchemaVmEndpointNatMappingsInterfaceNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmEndpointNatMappingsInterfaceNatMappings]
  }
  
  extension [Self <: SchemaVmEndpointNatMappingsInterfaceNatMappings](x: Self) {
    
    inline def setDrainNatIpPortRanges(value: js.Array[String]): Self = StObject.set(x, "drainNatIpPortRanges", value.asInstanceOf[js.Any])
    
    inline def setDrainNatIpPortRangesUndefined: Self = StObject.set(x, "drainNatIpPortRanges", js.undefined)
    
    inline def setDrainNatIpPortRangesVarargs(value: String*): Self = StObject.set(x, "drainNatIpPortRanges", js.Array(value :_*))
    
    inline def setNatIpPortRanges(value: js.Array[String]): Self = StObject.set(x, "natIpPortRanges", value.asInstanceOf[js.Any])
    
    inline def setNatIpPortRangesUndefined: Self = StObject.set(x, "natIpPortRanges", js.undefined)
    
    inline def setNatIpPortRangesVarargs(value: String*): Self = StObject.set(x, "natIpPortRanges", js.Array(value :_*))
    
    inline def setNumTotalDrainNatPorts(value: Double): Self = StObject.set(x, "numTotalDrainNatPorts", value.asInstanceOf[js.Any])
    
    inline def setNumTotalDrainNatPortsUndefined: Self = StObject.set(x, "numTotalDrainNatPorts", js.undefined)
    
    inline def setNumTotalNatPorts(value: Double): Self = StObject.set(x, "numTotalNatPorts", value.asInstanceOf[js.Any])
    
    inline def setNumTotalNatPortsUndefined: Self = StObject.set(x, "numTotalNatPorts", js.undefined)
    
    inline def setSourceAliasIpRange(value: String): Self = StObject.set(x, "sourceAliasIpRange", value.asInstanceOf[js.Any])
    
    inline def setSourceAliasIpRangeUndefined: Self = StObject.set(x, "sourceAliasIpRange", js.undefined)
    
    inline def setSourceVirtualIp(value: String): Self = StObject.set(x, "sourceVirtualIp", value.asInstanceOf[js.Any])
    
    inline def setSourceVirtualIpUndefined: Self = StObject.set(x, "sourceVirtualIp", js.undefined)
  }
}
