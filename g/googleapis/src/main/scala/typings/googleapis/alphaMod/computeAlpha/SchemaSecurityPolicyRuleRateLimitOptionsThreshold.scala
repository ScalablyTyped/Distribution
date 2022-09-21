package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleRateLimitOptionsThreshold extends StObject {
  
  /**
    * Number of HTTP(S) requests for calculating the threshold.
    */
  var count: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Interval over which the threshold is computed.
    */
  var intervalSec: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSecurityPolicyRuleRateLimitOptionsThreshold {
  
  inline def apply(): SchemaSecurityPolicyRuleRateLimitOptionsThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleRateLimitOptionsThreshold]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleRateLimitOptionsThreshold](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setIntervalSec(value: Double): Self = StObject.set(x, "intervalSec", value.asInstanceOf[js.Any])
    
    inline def setIntervalSecNull: Self = StObject.set(x, "intervalSec", null)
    
    inline def setIntervalSecUndefined: Self = StObject.set(x, "intervalSec", js.undefined)
  }
}
