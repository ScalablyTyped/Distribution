package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy extends StObject {
  
  /**
    * An optional, arbitrary JSON object with configuration data, understood by a locally installed custom policy implementation.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the custom policy. The value should match the type the custom implementation is registered with on the gRPC clients. It should follow protocol buffer message naming conventions and include the full path (e.g. myorg.CustomLbPolicy). The maximum length is 256 characters. Note that specifying the same custom policy more than once for a backend is not a valid configuration and will be rejected.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy {
  
  inline def apply(): SchemaBackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy]
  }
  
  extension [Self <: SchemaBackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
