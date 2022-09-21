package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchTransitiveMembershipsResponse extends StObject {
  
  /**
    * List of transitive members satisfying the query.
    */
  var memberships: js.UndefOr[js.Array[SchemaMemberRelation]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchTransitiveMembershipsResponse {
  
  inline def apply(): SchemaSearchTransitiveMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchTransitiveMembershipsResponse]
  }
  
  extension [Self <: SchemaSearchTransitiveMembershipsResponse](x: Self) {
    
    inline def setMemberships(value: js.Array[SchemaMemberRelation]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: SchemaMemberRelation*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
