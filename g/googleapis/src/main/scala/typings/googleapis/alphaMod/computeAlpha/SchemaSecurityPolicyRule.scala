package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRule extends StObject {
  
  /**
    * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
    */
  var direction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules. This field may only be specified when the versioned_expr is set to FIREWALL.
    */
  var enableLogging: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional, additional actions that are performed on headers.
    */
  var headerAction: js.UndefOr[SchemaSecurityPolicyRuleHttpHeaderAction] = js.undefined
  
  /**
    * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
    */
  var `match`: js.UndefOr[SchemaSecurityPolicyRuleMatcher] = js.undefined
  
  /**
    * Preconfigured WAF configuration to be applied for the rule. If the rule does not evaluate preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have no effect.
    */
  var preconfiguredWafConfig: js.UndefOr[SchemaSecurityPolicyRulePreconfiguredWafConfig] = js.undefined
  
  /**
    * If set to true, the specified action is not enforced.
    */
  var preview: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any other actions.
    */
  var rateLimitOptions: js.UndefOr[SchemaSecurityPolicyRuleRateLimitOptions] = js.undefined
  
  /**
    * Parameters defining the redirect action. Cannot be specified for any other actions.
    */
  var redirectOptions: js.UndefOr[SchemaSecurityPolicyRuleRedirectOptions] = js.undefined
  
  /**
    * This must be specified for redirect actions. Cannot be specified for any other actions.
    */
  var redirectTarget: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The minimum managed protection tier required for this rule.
    */
  var ruleManagedProtectionTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
    */
  var ruleNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Calculation of the complexity of a single firewall security policy rule.
    */
  var ruleTupleCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
    */
  var targetResources: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of service accounts indicating the sets of instances that are applied with this rule.
    */
  var targetServiceAccounts: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSecurityPolicyRule {
  
  inline def apply(): SchemaSecurityPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRule]
  }
  
  extension [Self <: SchemaSecurityPolicyRule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableLoggingNull: Self = StObject.set(x, "enableLogging", null)
    
    inline def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    inline def setHeaderAction(value: SchemaSecurityPolicyRuleHttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMatch(value: SchemaSecurityPolicyRuleMatcher): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setPreconfiguredWafConfig(value: SchemaSecurityPolicyRulePreconfiguredWafConfig): Self = StObject.set(x, "preconfiguredWafConfig", value.asInstanceOf[js.Any])
    
    inline def setPreconfiguredWafConfigUndefined: Self = StObject.set(x, "preconfiguredWafConfig", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewNull: Self = StObject.set(x, "preview", null)
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRateLimitOptions(value: SchemaSecurityPolicyRuleRateLimitOptions): Self = StObject.set(x, "rateLimitOptions", value.asInstanceOf[js.Any])
    
    inline def setRateLimitOptionsUndefined: Self = StObject.set(x, "rateLimitOptions", js.undefined)
    
    inline def setRedirectOptions(value: SchemaSecurityPolicyRuleRedirectOptions): Self = StObject.set(x, "redirectOptions", value.asInstanceOf[js.Any])
    
    inline def setRedirectOptionsUndefined: Self = StObject.set(x, "redirectOptions", js.undefined)
    
    inline def setRedirectTarget(value: String): Self = StObject.set(x, "redirectTarget", value.asInstanceOf[js.Any])
    
    inline def setRedirectTargetNull: Self = StObject.set(x, "redirectTarget", null)
    
    inline def setRedirectTargetUndefined: Self = StObject.set(x, "redirectTarget", js.undefined)
    
    inline def setRuleManagedProtectionTier(value: String): Self = StObject.set(x, "ruleManagedProtectionTier", value.asInstanceOf[js.Any])
    
    inline def setRuleManagedProtectionTierNull: Self = StObject.set(x, "ruleManagedProtectionTier", null)
    
    inline def setRuleManagedProtectionTierUndefined: Self = StObject.set(x, "ruleManagedProtectionTier", js.undefined)
    
    inline def setRuleNumber(value: String): Self = StObject.set(x, "ruleNumber", value.asInstanceOf[js.Any])
    
    inline def setRuleNumberNull: Self = StObject.set(x, "ruleNumber", null)
    
    inline def setRuleNumberUndefined: Self = StObject.set(x, "ruleNumber", js.undefined)
    
    inline def setRuleTupleCount(value: Double): Self = StObject.set(x, "ruleTupleCount", value.asInstanceOf[js.Any])
    
    inline def setRuleTupleCountNull: Self = StObject.set(x, "ruleTupleCount", null)
    
    inline def setRuleTupleCountUndefined: Self = StObject.set(x, "ruleTupleCount", js.undefined)
    
    inline def setTargetResources(value: js.Array[String]): Self = StObject.set(x, "targetResources", value.asInstanceOf[js.Any])
    
    inline def setTargetResourcesNull: Self = StObject.set(x, "targetResources", null)
    
    inline def setTargetResourcesUndefined: Self = StObject.set(x, "targetResources", js.undefined)
    
    inline def setTargetResourcesVarargs(value: String*): Self = StObject.set(x, "targetResources", js.Array(value*))
    
    inline def setTargetServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "targetServiceAccounts", value.asInstanceOf[js.Any])
    
    inline def setTargetServiceAccountsNull: Self = StObject.set(x, "targetServiceAccounts", null)
    
    inline def setTargetServiceAccountsUndefined: Self = StObject.set(x, "targetServiceAccounts", js.undefined)
    
    inline def setTargetServiceAccountsVarargs(value: String*): Self = StObject.set(x, "targetServiceAccounts", js.Array(value*))
  }
}
