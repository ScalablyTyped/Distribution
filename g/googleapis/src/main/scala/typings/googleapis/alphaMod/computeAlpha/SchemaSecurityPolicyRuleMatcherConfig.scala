package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSecurityPolicyRuleMatcherConfig extends StObject {
  
  /**
    * CIDR IP address range.  This field may only be specified when
    * versioned_expr is set to FIREWALL.
    */
  var destIpRanges: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Pairs of IP protocols and ports that the rule should match.  This field
    * may only be specified when versioned_expr is set to FIREWALL.
    */
  var destPorts: js.UndefOr[js.Array[SchemaSecurityPolicyRuleMatcherConfigDestinationPort]] = js.native
  
  /**
    * CIDR IP address range.
    */
  var srcIpRanges: js.UndefOr[js.Array[String]] = js.native
}
object SchemaSecurityPolicyRuleMatcherConfig {
  
  @scala.inline
  def apply(): SchemaSecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcherConfig]
  }
  
  @scala.inline
  implicit class SchemaSecurityPolicyRuleMatcherConfigMutableBuilder[Self <: SchemaSecurityPolicyRuleMatcherConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestIpRanges(value: js.Array[String]): Self = StObject.set(x, "destIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestIpRangesUndefined: Self = StObject.set(x, "destIpRanges", js.undefined)
    
    @scala.inline
    def setDestIpRangesVarargs(value: String*): Self = StObject.set(x, "destIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setDestPorts(value: js.Array[SchemaSecurityPolicyRuleMatcherConfigDestinationPort]): Self = StObject.set(x, "destPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestPortsUndefined: Self = StObject.set(x, "destPorts", js.undefined)
    
    @scala.inline
    def setDestPortsVarargs(value: SchemaSecurityPolicyRuleMatcherConfigDestinationPort*): Self = StObject.set(x, "destPorts", js.Array(value :_*))
    
    @scala.inline
    def setSrcIpRanges(value: js.Array[String]): Self = StObject.set(x, "srcIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcIpRangesUndefined: Self = StObject.set(x, "srcIpRanges", js.undefined)
    
    @scala.inline
    def setSrcIpRangesVarargs(value: String*): Self = StObject.set(x, "srcIpRanges", js.Array(value :_*))
  }
}
