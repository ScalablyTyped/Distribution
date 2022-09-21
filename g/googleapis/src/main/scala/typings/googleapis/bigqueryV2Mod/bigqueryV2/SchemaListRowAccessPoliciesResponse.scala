package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRowAccessPoliciesResponse extends StObject {
  
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Row access policies on the requested table.
    */
  var rowAccessPolicies: js.UndefOr[js.Array[SchemaRowAccessPolicy]] = js.undefined
}
object SchemaListRowAccessPoliciesResponse {
  
  inline def apply(): SchemaListRowAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRowAccessPoliciesResponse]
  }
  
  extension [Self <: SchemaListRowAccessPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRowAccessPolicies(value: js.Array[SchemaRowAccessPolicy]): Self = StObject.set(x, "rowAccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setRowAccessPoliciesUndefined: Self = StObject.set(x, "rowAccessPolicies", js.undefined)
    
    inline def setRowAccessPoliciesVarargs(value: SchemaRowAccessPolicy*): Self = StObject.set(x, "rowAccessPolicies", js.Array(value*))
  }
}
