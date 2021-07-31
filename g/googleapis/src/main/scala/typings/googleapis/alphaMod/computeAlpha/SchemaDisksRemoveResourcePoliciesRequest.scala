package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisksRemoveResourcePoliciesRequest extends StObject {
  
  /**
    * Resource policies to be removed from this disk.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaDisksRemoveResourcePoliciesRequest {
  
  @scala.inline
  def apply(): SchemaDisksRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksRemoveResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class SchemaDisksRemoveResourcePoliciesRequestMutableBuilder[Self <: SchemaDisksRemoveResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}
