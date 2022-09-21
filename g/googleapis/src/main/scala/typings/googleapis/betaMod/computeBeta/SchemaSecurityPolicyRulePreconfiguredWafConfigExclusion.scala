package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRulePreconfiguredWafConfigExclusion extends StObject {
  
  /**
    * A list of request cookie names whose value will be excluded from inspection during preconfigured WAF evaluation.
    */
  var requestCookiesToExclude: js.UndefOr[js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]] = js.undefined
  
  /**
    * A list of request header names whose value will be excluded from inspection during preconfigured WAF evaluation.
    */
  var requestHeadersToExclude: js.UndefOr[js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]] = js.undefined
  
  /**
    * A list of request query parameter names whose value will be excluded from inspection during preconfigured WAF evaluation. Note that the parameter can be in the query string or in the POST body.
    */
  var requestQueryParamsToExclude: js.UndefOr[js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]] = js.undefined
  
  /**
    * A list of request URIs from the request line to be excluded from inspection during preconfigured WAF evaluation. When specifying this field, the query or fragment part should be excluded.
    */
  var requestUrisToExclude: js.UndefOr[js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]] = js.undefined
  
  /**
    * A list of target rule IDs under the WAF rule set to apply the preconfigured WAF exclusion. If omitted, it refers to all the rule IDs under the WAF rule set.
    */
  var targetRuleIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Target WAF rule set to apply the preconfigured WAF exclusion.
    */
  var targetRuleSet: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyRulePreconfiguredWafConfigExclusion {
  
  inline def apply(): SchemaSecurityPolicyRulePreconfiguredWafConfigExclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusion]
  }
  
  extension [Self <: SchemaSecurityPolicyRulePreconfiguredWafConfigExclusion](x: Self) {
    
    inline def setRequestCookiesToExclude(value: js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]): Self = StObject.set(x, "requestCookiesToExclude", value.asInstanceOf[js.Any])
    
    inline def setRequestCookiesToExcludeUndefined: Self = StObject.set(x, "requestCookiesToExclude", js.undefined)
    
    inline def setRequestCookiesToExcludeVarargs(value: SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams*): Self = StObject.set(x, "requestCookiesToExclude", js.Array(value*))
    
    inline def setRequestHeadersToExclude(value: js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]): Self = StObject.set(x, "requestHeadersToExclude", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersToExcludeUndefined: Self = StObject.set(x, "requestHeadersToExclude", js.undefined)
    
    inline def setRequestHeadersToExcludeVarargs(value: SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams*): Self = StObject.set(x, "requestHeadersToExclude", js.Array(value*))
    
    inline def setRequestQueryParamsToExclude(value: js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]): Self = StObject.set(x, "requestQueryParamsToExclude", value.asInstanceOf[js.Any])
    
    inline def setRequestQueryParamsToExcludeUndefined: Self = StObject.set(x, "requestQueryParamsToExclude", js.undefined)
    
    inline def setRequestQueryParamsToExcludeVarargs(value: SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams*): Self = StObject.set(x, "requestQueryParamsToExclude", js.Array(value*))
    
    inline def setRequestUrisToExclude(value: js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]): Self = StObject.set(x, "requestUrisToExclude", value.asInstanceOf[js.Any])
    
    inline def setRequestUrisToExcludeUndefined: Self = StObject.set(x, "requestUrisToExclude", js.undefined)
    
    inline def setRequestUrisToExcludeVarargs(value: SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams*): Self = StObject.set(x, "requestUrisToExclude", js.Array(value*))
    
    inline def setTargetRuleIds(value: js.Array[String]): Self = StObject.set(x, "targetRuleIds", value.asInstanceOf[js.Any])
    
    inline def setTargetRuleIdsNull: Self = StObject.set(x, "targetRuleIds", null)
    
    inline def setTargetRuleIdsUndefined: Self = StObject.set(x, "targetRuleIds", js.undefined)
    
    inline def setTargetRuleIdsVarargs(value: String*): Self = StObject.set(x, "targetRuleIds", js.Array(value*))
    
    inline def setTargetRuleSet(value: String): Self = StObject.set(x, "targetRuleSet", value.asInstanceOf[js.Any])
    
    inline def setTargetRuleSetNull: Self = StObject.set(x, "targetRuleSet", null)
    
    inline def setTargetRuleSetUndefined: Self = StObject.set(x, "targetRuleSet", js.undefined)
  }
}
