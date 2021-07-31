package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a request to list policies for a given enterprise.
  */
trait SchemaListPoliciesResponse extends StObject {
  
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of policies.
    */
  var policies: js.UndefOr[js.Array[SchemaPolicy]] = js.undefined
}
object SchemaListPoliciesResponse {
  
  @scala.inline
  def apply(): SchemaListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPoliciesResponse]
  }
  
  @scala.inline
  implicit class SchemaListPoliciesResponseMutableBuilder[Self <: SchemaListPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPolicies(value: js.Array[SchemaPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: SchemaPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
