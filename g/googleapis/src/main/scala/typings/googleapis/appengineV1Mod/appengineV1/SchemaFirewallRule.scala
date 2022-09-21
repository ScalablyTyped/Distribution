package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirewallRule extends StObject {
  
  /**
    * The action to take on matched requests.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional string description of this rule. This field has a maximum length of 400 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
    */
  var sourceRange: js.UndefOr[String | Null] = js.undefined
}
object SchemaFirewallRule {
  
  inline def apply(): SchemaFirewallRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallRule]
  }
  
  extension [Self <: SchemaFirewallRule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSourceRange(value: String): Self = StObject.set(x, "sourceRange", value.asInstanceOf[js.Any])
    
    inline def setSourceRangeNull: Self = StObject.set(x, "sourceRange", null)
    
    inline def setSourceRangeUndefined: Self = StObject.set(x, "sourceRange", js.undefined)
  }
}
