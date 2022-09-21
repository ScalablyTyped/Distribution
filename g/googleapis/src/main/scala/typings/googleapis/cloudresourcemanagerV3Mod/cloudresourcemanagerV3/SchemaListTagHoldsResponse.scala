package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTagHoldsResponse extends StObject {
  
  /**
    * Pagination token. If the result set is too large to fit in a single response, this token is returned. It encodes the position of the current result cursor. Feeding this value into a new list request with the `page_token` parameter gives the next page of the results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set. Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A possibly paginated list of TagHolds.
    */
  var tagHolds: js.UndefOr[js.Array[SchemaTagHold]] = js.undefined
}
object SchemaListTagHoldsResponse {
  
  inline def apply(): SchemaListTagHoldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTagHoldsResponse]
  }
  
  extension [Self <: SchemaListTagHoldsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTagHolds(value: js.Array[SchemaTagHold]): Self = StObject.set(x, "tagHolds", value.asInstanceOf[js.Any])
    
    inline def setTagHoldsUndefined: Self = StObject.set(x, "tagHolds", js.undefined)
    
    inline def setTagHoldsVarargs(value: SchemaTagHold*): Self = StObject.set(x, "tagHolds", js.Array(value*))
  }
}
