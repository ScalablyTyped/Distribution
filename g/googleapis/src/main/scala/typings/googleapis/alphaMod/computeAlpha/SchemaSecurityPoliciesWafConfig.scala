package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPoliciesWafConfig extends StObject {
  
  var wafRules: js.UndefOr[SchemaPreconfiguredWafSet] = js.undefined
}
object SchemaSecurityPoliciesWafConfig {
  
  inline def apply(): SchemaSecurityPoliciesWafConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPoliciesWafConfig]
  }
  
  extension [Self <: SchemaSecurityPoliciesWafConfig](x: Self) {
    
    inline def setWafRules(value: SchemaPreconfiguredWafSet): Self = StObject.set(x, "wafRules", value.asInstanceOf[js.Any])
    
    inline def setWafRulesUndefined: Self = StObject.set(x, "wafRules", js.undefined)
  }
}
