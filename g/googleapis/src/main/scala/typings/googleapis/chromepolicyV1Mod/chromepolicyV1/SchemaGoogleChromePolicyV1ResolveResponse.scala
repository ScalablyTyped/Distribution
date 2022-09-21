package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1ResolveResponse extends StObject {
  
  /**
    * The page token used to get the next set of resolved policies found by the request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of resolved policies found by the resolve request.
    */
  var resolvedPolicies: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1ResolvedPolicy]] = js.undefined
}
object SchemaGoogleChromePolicyV1ResolveResponse {
  
  inline def apply(): SchemaGoogleChromePolicyV1ResolveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1ResolveResponse]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1ResolveResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResolvedPolicies(value: js.Array[SchemaGoogleChromePolicyV1ResolvedPolicy]): Self = StObject.set(x, "resolvedPolicies", value.asInstanceOf[js.Any])
    
    inline def setResolvedPoliciesUndefined: Self = StObject.set(x, "resolvedPolicies", js.undefined)
    
    inline def setResolvedPoliciesVarargs(value: SchemaGoogleChromePolicyV1ResolvedPolicy*): Self = StObject.set(x, "resolvedPolicies", js.Array(value*))
  }
}
