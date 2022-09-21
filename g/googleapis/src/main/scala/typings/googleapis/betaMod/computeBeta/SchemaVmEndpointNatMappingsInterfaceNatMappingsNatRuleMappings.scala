package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings extends StObject {
  
  /**
    * List of all drain IP:port-range mappings assigned to this interface by this rule. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
    */
  var drainNatIpPortRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of all IP:port-range mappings assigned to this interface by this rule. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
    */
  var natIpPortRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Total number of drain ports across all NAT IPs allocated to this interface by this rule. It equals the aggregated port number in the field drain_nat_ip_port_ranges.
    */
  var numTotalDrainNatPorts: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total number of ports across all NAT IPs allocated to this interface by this rule. It equals the aggregated port number in the field nat_ip_port_ranges.
    */
  var numTotalNatPorts: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rule number of the NAT Rule.
    */
  var ruleNumber: js.UndefOr[Double | Null] = js.undefined
}
object SchemaVmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings {
  
  inline def apply(): SchemaVmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings]
  }
  
  extension [Self <: SchemaVmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings](x: Self) {
    
    inline def setDrainNatIpPortRanges(value: js.Array[String]): Self = StObject.set(x, "drainNatIpPortRanges", value.asInstanceOf[js.Any])
    
    inline def setDrainNatIpPortRangesNull: Self = StObject.set(x, "drainNatIpPortRanges", null)
    
    inline def setDrainNatIpPortRangesUndefined: Self = StObject.set(x, "drainNatIpPortRanges", js.undefined)
    
    inline def setDrainNatIpPortRangesVarargs(value: String*): Self = StObject.set(x, "drainNatIpPortRanges", js.Array(value*))
    
    inline def setNatIpPortRanges(value: js.Array[String]): Self = StObject.set(x, "natIpPortRanges", value.asInstanceOf[js.Any])
    
    inline def setNatIpPortRangesNull: Self = StObject.set(x, "natIpPortRanges", null)
    
    inline def setNatIpPortRangesUndefined: Self = StObject.set(x, "natIpPortRanges", js.undefined)
    
    inline def setNatIpPortRangesVarargs(value: String*): Self = StObject.set(x, "natIpPortRanges", js.Array(value*))
    
    inline def setNumTotalDrainNatPorts(value: Double): Self = StObject.set(x, "numTotalDrainNatPorts", value.asInstanceOf[js.Any])
    
    inline def setNumTotalDrainNatPortsNull: Self = StObject.set(x, "numTotalDrainNatPorts", null)
    
    inline def setNumTotalDrainNatPortsUndefined: Self = StObject.set(x, "numTotalDrainNatPorts", js.undefined)
    
    inline def setNumTotalNatPorts(value: Double): Self = StObject.set(x, "numTotalNatPorts", value.asInstanceOf[js.Any])
    
    inline def setNumTotalNatPortsNull: Self = StObject.set(x, "numTotalNatPorts", null)
    
    inline def setNumTotalNatPortsUndefined: Self = StObject.set(x, "numTotalNatPorts", js.undefined)
    
    inline def setRuleNumber(value: Double): Self = StObject.set(x, "ruleNumber", value.asInstanceOf[js.Any])
    
    inline def setRuleNumberNull: Self = StObject.set(x, "ruleNumber", null)
    
    inline def setRuleNumberUndefined: Self = StObject.set(x, "ruleNumber", js.undefined)
  }
}
