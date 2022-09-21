package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListOrgPoliciesResponse extends StObject {
  
  /**
    * Page token used to retrieve the next page. This is currently not used, but the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `Policies` that are set on the resource. It will be empty if no `Policies` are set.
    */
  var policies: js.UndefOr[js.Array[SchemaOrgPolicy]] = js.undefined
}
object SchemaListOrgPoliciesResponse {
  
  inline def apply(): SchemaListOrgPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOrgPoliciesResponse]
  }
  
  extension [Self <: SchemaListOrgPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicies(value: js.Array[SchemaOrgPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaOrgPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
