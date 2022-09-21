package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceLocalityLoadBalancingPolicyConfigPolicy extends StObject {
  
  /**
    * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendServiceLocalityLoadBalancingPolicyConfigPolicy {
  
  inline def apply(): SchemaBackendServiceLocalityLoadBalancingPolicyConfigPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceLocalityLoadBalancingPolicyConfigPolicy]
  }
  
  extension [Self <: SchemaBackendServiceLocalityLoadBalancingPolicyConfigPolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
