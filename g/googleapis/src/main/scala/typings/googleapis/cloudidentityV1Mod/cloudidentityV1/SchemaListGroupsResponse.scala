package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGroupsResponse extends StObject {
  
  /**
    * Groups returned in response to list request. The results are not sorted.
    */
  var groups: js.UndefOr[js.Array[SchemaGroup]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results available for listing.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGroupsResponse {
  
  inline def apply(): SchemaListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGroupsResponse]
  }
  
  extension [Self <: SchemaListGroupsResponse](x: Self) {
    
    inline def setGroups(value: js.Array[SchemaGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: SchemaGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
