package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesRemoveResourcePoliciesRequest extends StObject {
  
  /**
    * Resource policies to be removed from this instance.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaInstancesRemoveResourcePoliciesRequest {
  
  inline def apply(): SchemaInstancesRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRemoveResourcePoliciesRequest]
  }
  
  extension [Self <: SchemaInstancesRemoveResourcePoliciesRequest](x: Self) {
    
    inline def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    inline def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}
