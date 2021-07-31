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
  
  @scala.inline
  def apply(): SchemaInstancesRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRemoveResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesRemoveResourcePoliciesRequestMutableBuilder[Self <: SchemaInstancesRemoveResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}
