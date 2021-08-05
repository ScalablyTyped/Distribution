package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchGroupsResponse extends StObject {
  
  /**
    * List of Groups satisfying the search query.
    */
  var groups: js.UndefOr[js.Array[SchemaGroup]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for specified query.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaSearchGroupsResponse {
  
  inline def apply(): SchemaSearchGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchGroupsResponse]
  }
  
  extension [Self <: SchemaSearchGroupsResponse](x: Self) {
    
    inline def setGroups(value: js.Array[SchemaGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: SchemaGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
