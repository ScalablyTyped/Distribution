package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirewallPolicyRule extends StObject {
  
  /**
    * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description for this resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The direction in which this rule applies.
    */
  var direction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
    */
  var enableLogging: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
    */
  var `match`: js.UndefOr[SchemaFirewallPolicyRuleMatcher] = js.undefined
  
  /**
    * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An optional name for the rule. This field is not a unique identifier and can be updated.
    */
  var ruleName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Calculation of the complexity of a single firewall policy rule.
    */
  var ruleTupleCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
    */
  var targetResources: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of secure tags that controls which instances the firewall rule applies to. If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the target_secure_tag are in INEFFECTIVE state, then this rule will be ignored. targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
    */
  var targetSecureTags: js.UndefOr[js.Array[SchemaFirewallPolicyRuleSecureTag]] = js.undefined
  
  /**
    * A list of service accounts indicating the sets of instances that are applied with this rule.
    */
  var targetServiceAccounts: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaFirewallPolicyRule {
  
  inline def apply(): SchemaFirewallPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallPolicyRule]
  }
  
  extension [Self <: SchemaFirewallPolicyRule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableLoggingNull: Self = StObject.set(x, "enableLogging", null)
    
    inline def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMatch(value: SchemaFirewallPolicyRuleMatcher): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameNull: Self = StObject.set(x, "ruleName", null)
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
    
    inline def setRuleTupleCount(value: Double): Self = StObject.set(x, "ruleTupleCount", value.asInstanceOf[js.Any])
    
    inline def setRuleTupleCountNull: Self = StObject.set(x, "ruleTupleCount", null)
    
    inline def setRuleTupleCountUndefined: Self = StObject.set(x, "ruleTupleCount", js.undefined)
    
    inline def setTargetResources(value: js.Array[String]): Self = StObject.set(x, "targetResources", value.asInstanceOf[js.Any])
    
    inline def setTargetResourcesNull: Self = StObject.set(x, "targetResources", null)
    
    inline def setTargetResourcesUndefined: Self = StObject.set(x, "targetResources", js.undefined)
    
    inline def setTargetResourcesVarargs(value: String*): Self = StObject.set(x, "targetResources", js.Array(value*))
    
    inline def setTargetSecureTags(value: js.Array[SchemaFirewallPolicyRuleSecureTag]): Self = StObject.set(x, "targetSecureTags", value.asInstanceOf[js.Any])
    
    inline def setTargetSecureTagsUndefined: Self = StObject.set(x, "targetSecureTags", js.undefined)
    
    inline def setTargetSecureTagsVarargs(value: SchemaFirewallPolicyRuleSecureTag*): Self = StObject.set(x, "targetSecureTags", js.Array(value*))
    
    inline def setTargetServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "targetServiceAccounts", value.asInstanceOf[js.Any])
    
    inline def setTargetServiceAccountsNull: Self = StObject.set(x, "targetServiceAccounts", null)
    
    inline def setTargetServiceAccountsUndefined: Self = StObject.set(x, "targetServiceAccounts", js.undefined)
    
    inline def setTargetServiceAccountsVarargs(value: String*): Self = StObject.set(x, "targetServiceAccounts", js.Array(value*))
  }
}
