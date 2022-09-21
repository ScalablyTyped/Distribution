package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlobalSetPolicyRequest extends StObject {
  
  /**
    * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify bindings.
    */
  var bindings: js.UndefOr[js.Array[SchemaBinding]] = js.undefined
  
  /**
    * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify the etag.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is limited to a few 10s of KB. An empty policy is in general a valid policy but certain services (like Projects) might reject them.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.undefined
}
object SchemaGlobalSetPolicyRequest {
  
  inline def apply(): SchemaGlobalSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlobalSetPolicyRequest]
  }
  
  extension [Self <: SchemaGlobalSetPolicyRequest](x: Self) {
    
    inline def setBindings(value: js.Array[SchemaBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: SchemaBinding*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
