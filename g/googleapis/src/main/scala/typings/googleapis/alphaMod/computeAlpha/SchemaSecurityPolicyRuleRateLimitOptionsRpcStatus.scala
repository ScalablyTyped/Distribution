package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleRateLimitOptionsRpcStatus extends StObject {
  
  /**
    * The status code, which should be an enum value of google.rpc.Code.
    */
  var code: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A developer-facing error message, which should be in English.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyRuleRateLimitOptionsRpcStatus {
  
  inline def apply(): SchemaSecurityPolicyRuleRateLimitOptionsRpcStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleRateLimitOptionsRpcStatus]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleRateLimitOptionsRpcStatus](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
