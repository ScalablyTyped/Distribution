package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstancesAddResourcePoliciesRequest extends StObject {
  
  /**
    * Resource policies to be added to this instance.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}
object SchemaInstancesAddResourcePoliciesRequest {
  
  @scala.inline
  def apply(): SchemaInstancesAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesAddResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesAddResourcePoliciesRequestMutableBuilder[Self <: SchemaInstancesAddResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}
