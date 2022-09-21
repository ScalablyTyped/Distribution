package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1ListPolicySchemasResponse extends StObject {
  
  /**
    * The page token used to get the next page of policy schemas.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of policy schemas that match the query.
    */
  var policySchemas: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1PolicySchema]] = js.undefined
}
object SchemaGoogleChromePolicyV1ListPolicySchemasResponse {
  
  inline def apply(): SchemaGoogleChromePolicyV1ListPolicySchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1ListPolicySchemasResponse]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1ListPolicySchemasResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicySchemas(value: js.Array[SchemaGoogleChromePolicyV1PolicySchema]): Self = StObject.set(x, "policySchemas", value.asInstanceOf[js.Any])
    
    inline def setPolicySchemasUndefined: Self = StObject.set(x, "policySchemas", js.undefined)
    
    inline def setPolicySchemasVarargs(value: SchemaGoogleChromePolicyV1PolicySchema*): Self = StObject.set(x, "policySchemas", js.Array(value*))
  }
}
