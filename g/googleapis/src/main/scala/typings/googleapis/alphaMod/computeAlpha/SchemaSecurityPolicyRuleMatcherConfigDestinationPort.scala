package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleMatcherConfigDestinationPort extends StObject {
  
  /**
    * The IP protocol to which this rule applies. The protocol type is required
    * when creating a firewall rule. This value can either be one of the
    * following well known protocol strings (tcp, udp, icmp, esp, ah, ipip,
    * sctp), or the IP protocol number.
    */
  var ipProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * An optional list of ports to which this rule applies. This field is only
    * applicable for UDP or TCP protocol. Each entry must be either an integer
    * or a range. If not specified, this rule applies to connections through
    * any port.  Example inputs include: [&quot;22&quot;],
    * [&quot;80&quot;,&quot;443&quot;], and [&quot;12345-12349&quot;].  This
    * field may only be specified when versioned_expr is set to FIREWALL.
    */
  var ports: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaSecurityPolicyRuleMatcherConfigDestinationPort {
  
  inline def apply(): SchemaSecurityPolicyRuleMatcherConfigDestinationPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcherConfigDestinationPort]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleMatcherConfigDestinationPort](x: Self) {
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "ipProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "ipProtocol", js.undefined)
    
    inline def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
