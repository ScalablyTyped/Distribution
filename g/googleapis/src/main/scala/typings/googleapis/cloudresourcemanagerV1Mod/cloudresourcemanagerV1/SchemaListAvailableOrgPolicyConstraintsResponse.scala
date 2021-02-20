package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response returned from the ListAvailableOrgPolicyConstraints method.
  * Returns all `Constraints` that could be set at this level of the hierarchy
  * (contrast with the response from `ListPolicies`, which returns all policies
  * which are set).
  */
@js.native
trait SchemaListAvailableOrgPolicyConstraintsResponse extends StObject {
  
  /**
    * The collection of constraints that are settable on the request resource.
    */
  var constraints: js.UndefOr[js.Array[SchemaConstraint]] = js.native
  
  /**
    * Page token used to retrieve the next page. This is currently not used.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListAvailableOrgPolicyConstraintsResponse {
  
  @scala.inline
  def apply(): SchemaListAvailableOrgPolicyConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAvailableOrgPolicyConstraintsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAvailableOrgPolicyConstraintsResponseMutableBuilder[Self <: SchemaListAvailableOrgPolicyConstraintsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraints(value: js.Array[SchemaConstraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    @scala.inline
    def setConstraintsVarargs(value: SchemaConstraint*): Self = StObject.set(x, "constraints", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
