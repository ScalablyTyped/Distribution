package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRulePreconfiguredWafConfig extends StObject {
  
  /**
    * A list of exclusions to apply during preconfigured WAF evaluation.
    */
  var exclusions: js.UndefOr[js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusion]] = js.undefined
}
object SchemaSecurityPolicyRulePreconfiguredWafConfig {
  
  inline def apply(): SchemaSecurityPolicyRulePreconfiguredWafConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRulePreconfiguredWafConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyRulePreconfiguredWafConfig](x: Self) {
    
    inline def setExclusions(value: js.Array[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusion]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: SchemaSecurityPolicyRulePreconfiguredWafConfigExclusion*): Self = StObject.set(x, "exclusions", js.Array(value*))
  }
}
