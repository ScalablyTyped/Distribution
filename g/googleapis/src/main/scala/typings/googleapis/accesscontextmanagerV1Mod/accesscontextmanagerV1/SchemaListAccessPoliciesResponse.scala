package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to `ListAccessPoliciesRequest`.
  */
trait SchemaListAccessPoliciesResponse extends StObject {
  
  /**
    * List of the AccessPolicy instances.
    */
  var accessPolicies: js.UndefOr[js.Array[SchemaAccessPolicy]] = js.undefined
  
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAccessPoliciesResponse {
  
  inline def apply(): SchemaListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccessPoliciesResponse]
  }
  
  extension [Self <: SchemaListAccessPoliciesResponse](x: Self) {
    
    inline def setAccessPolicies(value: js.Array[SchemaAccessPolicy]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "accessPolicies", js.undefined)
    
    inline def setAccessPoliciesVarargs(value: SchemaAccessPolicy*): Self = StObject.set(x, "accessPolicies", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
