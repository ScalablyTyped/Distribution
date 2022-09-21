package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceLocalityLoadBalancingPolicyConfig extends StObject {
  
  var customPolicy: js.UndefOr[SchemaBackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy] = js.undefined
  
  var policy: js.UndefOr[SchemaBackendServiceLocalityLoadBalancingPolicyConfigPolicy] = js.undefined
}
object SchemaBackendServiceLocalityLoadBalancingPolicyConfig {
  
  inline def apply(): SchemaBackendServiceLocalityLoadBalancingPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceLocalityLoadBalancingPolicyConfig]
  }
  
  extension [Self <: SchemaBackendServiceLocalityLoadBalancingPolicyConfig](x: Self) {
    
    inline def setCustomPolicy(value: SchemaBackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy): Self = StObject.set(x, "customPolicy", value.asInstanceOf[js.Any])
    
    inline def setCustomPolicyUndefined: Self = StObject.set(x, "customPolicy", js.undefined)
    
    inline def setPolicy(value: SchemaBackendServiceLocalityLoadBalancingPolicyConfigPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
