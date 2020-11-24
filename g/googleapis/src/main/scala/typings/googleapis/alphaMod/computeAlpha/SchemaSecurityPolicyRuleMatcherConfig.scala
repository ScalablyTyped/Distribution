package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSecurityPolicyRuleMatcherConfig extends js.Object {
  
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
  implicit class SchemaSecurityPolicyRuleMatcherConfigOps[Self <: SchemaSecurityPolicyRuleMatcherConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestIpRangesVarargs(value: String*): Self = this.set("destIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setDestIpRanges(value: js.Array[String]): Self = this.set("destIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestIpRanges: Self = this.set("destIpRanges", js.undefined)
    
    @scala.inline
    def setDestPortsVarargs(value: SchemaSecurityPolicyRuleMatcherConfigDestinationPort*): Self = this.set("destPorts", js.Array(value :_*))
    
    @scala.inline
    def setDestPorts(value: js.Array[SchemaSecurityPolicyRuleMatcherConfigDestinationPort]): Self = this.set("destPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestPorts: Self = this.set("destPorts", js.undefined)
    
    @scala.inline
    def setSrcIpRangesVarargs(value: String*): Self = this.set("srcIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setSrcIpRanges(value: js.Array[String]): Self = this.set("srcIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcIpRanges: Self = this.set("srcIpRanges", js.undefined)
  }
}
