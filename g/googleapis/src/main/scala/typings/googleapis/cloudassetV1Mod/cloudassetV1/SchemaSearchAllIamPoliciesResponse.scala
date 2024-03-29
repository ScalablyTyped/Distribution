package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchAllIamPoliciesResponse extends StObject {
  
  /**
    * Set if there are more results than those appearing in this response; to get the next set of results, call this method again, using this value as the `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of IamPolicy that match the search query. Related information such as the associated resource is returned along with the policy.
    */
  var results: js.UndefOr[js.Array[SchemaIamPolicySearchResult]] = js.undefined
}
object SchemaSearchAllIamPoliciesResponse {
  
  inline def apply(): SchemaSearchAllIamPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchAllIamPoliciesResponse]
  }
  
  extension [Self <: SchemaSearchAllIamPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResults(value: js.Array[SchemaIamPolicySearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaIamPolicySearchResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
