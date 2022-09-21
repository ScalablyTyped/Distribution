package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchTransitiveGroupsResponse extends StObject {
  
  /**
    * List of transitive groups satisfying the query.
    */
  var memberships: js.UndefOr[js.Array[SchemaGroupRelation]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results available for listing.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchTransitiveGroupsResponse {
  
  inline def apply(): SchemaSearchTransitiveGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchTransitiveGroupsResponse]
  }
  
  extension [Self <: SchemaSearchTransitiveGroupsResponse](x: Self) {
    
    inline def setMemberships(value: js.Array[SchemaGroupRelation]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: SchemaGroupRelation*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
