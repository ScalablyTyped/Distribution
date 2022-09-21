package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleHttpHeaderAction extends StObject {
  
  /**
    * The list of request headers to add or overwrite if they're already present.
    */
  var requestHeadersToAdds: js.UndefOr[js.Array[SchemaSecurityPolicyRuleHttpHeaderActionHttpHeaderOption]] = js.undefined
}
object SchemaSecurityPolicyRuleHttpHeaderAction {
  
  inline def apply(): SchemaSecurityPolicyRuleHttpHeaderAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleHttpHeaderAction]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleHttpHeaderAction](x: Self) {
    
    inline def setRequestHeadersToAdds(value: js.Array[SchemaSecurityPolicyRuleHttpHeaderActionHttpHeaderOption]): Self = StObject.set(x, "requestHeadersToAdds", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersToAddsUndefined: Self = StObject.set(x, "requestHeadersToAdds", js.undefined)
    
    inline def setRequestHeadersToAddsVarargs(value: SchemaSecurityPolicyRuleHttpHeaderActionHttpHeaderOption*): Self = StObject.set(x, "requestHeadersToAdds", js.Array(value*))
  }
}
