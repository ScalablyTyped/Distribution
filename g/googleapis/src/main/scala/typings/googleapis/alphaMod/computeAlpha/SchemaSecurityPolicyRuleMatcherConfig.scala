package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleMatcherConfig extends StObject {
  
  /**
    * CIDR IP address range. This field may only be specified when versioned_expr is set to FIREWALL.
    */
  var destIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
    */
  var destPorts: js.UndefOr[js.Array[SchemaSecurityPolicyRuleMatcherConfigDestinationPort]] = js.undefined
  
  /**
    * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
    */
  var layer4Configs: js.UndefOr[js.Array[SchemaSecurityPolicyRuleMatcherConfigLayer4Config]] = js.undefined
  
  /**
    * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
    */
  var srcIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSecurityPolicyRuleMatcherConfig {
  
  inline def apply(): SchemaSecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcherConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleMatcherConfig](x: Self) {
    
    inline def setDestIpRanges(value: js.Array[String]): Self = StObject.set(x, "destIpRanges", value.asInstanceOf[js.Any])
    
    inline def setDestIpRangesNull: Self = StObject.set(x, "destIpRanges", null)
    
    inline def setDestIpRangesUndefined: Self = StObject.set(x, "destIpRanges", js.undefined)
    
    inline def setDestIpRangesVarargs(value: String*): Self = StObject.set(x, "destIpRanges", js.Array(value*))
    
    inline def setDestPorts(value: js.Array[SchemaSecurityPolicyRuleMatcherConfigDestinationPort]): Self = StObject.set(x, "destPorts", value.asInstanceOf[js.Any])
    
    inline def setDestPortsUndefined: Self = StObject.set(x, "destPorts", js.undefined)
    
    inline def setDestPortsVarargs(value: SchemaSecurityPolicyRuleMatcherConfigDestinationPort*): Self = StObject.set(x, "destPorts", js.Array(value*))
    
    inline def setLayer4Configs(value: js.Array[SchemaSecurityPolicyRuleMatcherConfigLayer4Config]): Self = StObject.set(x, "layer4Configs", value.asInstanceOf[js.Any])
    
    inline def setLayer4ConfigsUndefined: Self = StObject.set(x, "layer4Configs", js.undefined)
    
    inline def setLayer4ConfigsVarargs(value: SchemaSecurityPolicyRuleMatcherConfigLayer4Config*): Self = StObject.set(x, "layer4Configs", js.Array(value*))
    
    inline def setSrcIpRanges(value: js.Array[String]): Self = StObject.set(x, "srcIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSrcIpRangesNull: Self = StObject.set(x, "srcIpRanges", null)
    
    inline def setSrcIpRangesUndefined: Self = StObject.set(x, "srcIpRanges", js.undefined)
    
    inline def setSrcIpRangesVarargs(value: String*): Self = StObject.set(x, "srcIpRanges", js.Array(value*))
  }
}
