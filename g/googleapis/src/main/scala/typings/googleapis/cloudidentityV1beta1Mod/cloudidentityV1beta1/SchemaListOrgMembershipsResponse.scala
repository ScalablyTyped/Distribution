package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListOrgMembershipsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is empty, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The non-vacuous membership in an orgUnit.
    */
  var orgMemberships: js.UndefOr[js.Array[SchemaOrgMembership]] = js.undefined
}
object SchemaListOrgMembershipsResponse {
  
  inline def apply(): SchemaListOrgMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOrgMembershipsResponse]
  }
  
  extension [Self <: SchemaListOrgMembershipsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOrgMemberships(value: js.Array[SchemaOrgMembership]): Self = StObject.set(x, "orgMemberships", value.asInstanceOf[js.Any])
    
    inline def setOrgMembershipsUndefined: Self = StObject.set(x, "orgMemberships", js.undefined)
    
    inline def setOrgMembershipsVarargs(value: SchemaOrgMembership*): Self = StObject.set(x, "orgMemberships", js.Array(value*))
  }
}
