package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a rule that describes one or more match conditions along with
  * the action to be taken when traffic matches this condition (allow or deny).
  */
trait SchemaSecurityPolicyRule extends StObject {
  
  /**
    * The Action to preform when the client connection triggers the rule. Can
    * currently be either &quot;allow&quot; or &quot;deny()&quot; where valid
    * values for status are 403, 404, and 502.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The direction in which this rule applies. This field may only be
    * specified when versioned_expr is set to FIREWALL.
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * Denotes whether to enable logging for a particular rule. If logging is
    * enabled, logs will be exported to the configured export destination in
    * Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you
    * cannot enable logging on &quot;goto_next&quot; rules.  This field may
    * only be specified when the versioned_expr is set to FIREWALL.
    */
  var enableLogging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Output only] Type of the resource. Always compute#securityPolicyRule for
    * security policy rules
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A match condition that incoming traffic is evaluated against. If it
    * evaluates to true, the corresponding ?action? is enforced.
    */
  var `match`: js.UndefOr[SchemaSecurityPolicyRuleMatcher] = js.undefined
  
  /**
    * If set to true, the specified action is not enforced.
    */
  var preview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An integer indicating the priority of a rule in the list. The priority
    * must be a positive value between 0 and 2147483647. Rules are evaluated
    * from highest to lowest priority where 0 is the highest priority and
    * 2147483647 is the lowest prority.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Must be specified if the action is &quot;rate_based_blacklist&quot; or
    * &quot;throttle&quot;. Cannot be specified for any other actions.
    */
  var rateLimitOptions: js.UndefOr[SchemaSecurityPolicyRuleRateLimitOptions] = js.undefined
  
  /**
    * [Output Only] Calculation of the complexity of a single firewall security
    * policy rule.
    */
  var ruleTupleCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of network resource URLs to which this rule applies. This field
    * allows you to control which network?s VMs get this rule. If this field is
    * left blank, all VMs within the organization will receive the rule.  This
    * field may only be specified when versioned_expr is set to FIREWALL.
    */
  var targetResources: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaSecurityPolicyRule {
  
  @scala.inline
  def apply(): SchemaSecurityPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRule]
  }
  
  @scala.inline
  implicit class SchemaSecurityPolicyRuleMutableBuilder[Self <: SchemaSecurityPolicyRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMatch(value: SchemaSecurityPolicyRuleMatcher): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setRateLimitOptions(value: SchemaSecurityPolicyRuleRateLimitOptions): Self = StObject.set(x, "rateLimitOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimitOptionsUndefined: Self = StObject.set(x, "rateLimitOptions", js.undefined)
    
    @scala.inline
    def setRuleTupleCount(value: Double): Self = StObject.set(x, "ruleTupleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleTupleCountUndefined: Self = StObject.set(x, "ruleTupleCount", js.undefined)
    
    @scala.inline
    def setTargetResources(value: js.Array[String]): Self = StObject.set(x, "targetResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourcesUndefined: Self = StObject.set(x, "targetResources", js.undefined)
    
    @scala.inline
    def setTargetResourcesVarargs(value: String*): Self = StObject.set(x, "targetResources", js.Array(value :_*))
  }
}
