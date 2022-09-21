package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchGroupsResponse extends StObject {
  
  /**
    * The `Group` resources that match the search query.
    */
  var groups: js.UndefOr[js.Array[SchemaGroup]] = js.undefined
  
  /**
    * A continuation token to retrieve the next page of results, or empty if there are no more results available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchGroupsResponse {
  
  inline def apply(): SchemaSearchGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchGroupsResponse]
  }
  
  extension [Self <: SchemaSearchGroupsResponse](x: Self) {
    
    inline def setGroups(value: js.Array[SchemaGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: SchemaGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
