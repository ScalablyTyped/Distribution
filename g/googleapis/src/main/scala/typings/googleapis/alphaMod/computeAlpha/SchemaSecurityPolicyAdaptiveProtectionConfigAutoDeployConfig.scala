package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyAdaptiveProtectionConfigAutoDeployConfig extends StObject {
  
  var confidenceThreshold: js.UndefOr[Double | Null] = js.undefined
  
  var expirationSec: js.UndefOr[Double | Null] = js.undefined
  
  var impactedBaselineThreshold: js.UndefOr[Double | Null] = js.undefined
  
  var loadThreshold: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSecurityPolicyAdaptiveProtectionConfigAutoDeployConfig {
  
  inline def apply(): SchemaSecurityPolicyAdaptiveProtectionConfigAutoDeployConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAdaptiveProtectionConfigAutoDeployConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyAdaptiveProtectionConfigAutoDeployConfig](x: Self) {
    
    inline def setConfidenceThreshold(value: Double): Self = StObject.set(x, "confidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setConfidenceThresholdNull: Self = StObject.set(x, "confidenceThreshold", null)
    
    inline def setConfidenceThresholdUndefined: Self = StObject.set(x, "confidenceThreshold", js.undefined)
    
    inline def setExpirationSec(value: Double): Self = StObject.set(x, "expirationSec", value.asInstanceOf[js.Any])
    
    inline def setExpirationSecNull: Self = StObject.set(x, "expirationSec", null)
    
    inline def setExpirationSecUndefined: Self = StObject.set(x, "expirationSec", js.undefined)
    
    inline def setImpactedBaselineThreshold(value: Double): Self = StObject.set(x, "impactedBaselineThreshold", value.asInstanceOf[js.Any])
    
    inline def setImpactedBaselineThresholdNull: Self = StObject.set(x, "impactedBaselineThreshold", null)
    
    inline def setImpactedBaselineThresholdUndefined: Self = StObject.set(x, "impactedBaselineThreshold", js.undefined)
    
    inline def setLoadThreshold(value: Double): Self = StObject.set(x, "loadThreshold", value.asInstanceOf[js.Any])
    
    inline def setLoadThresholdNull: Self = StObject.set(x, "loadThreshold", null)
    
    inline def setLoadThresholdUndefined: Self = StObject.set(x, "loadThreshold", js.undefined)
  }
}
