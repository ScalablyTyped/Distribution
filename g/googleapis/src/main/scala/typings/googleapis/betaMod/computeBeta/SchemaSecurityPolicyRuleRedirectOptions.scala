package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleRedirectOptions extends StObject {
  
  /**
    * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
    */
  var target: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the redirect action.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyRuleRedirectOptions {
  
  inline def apply(): SchemaSecurityPolicyRuleRedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleRedirectOptions]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleRedirectOptions](x: Self) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
