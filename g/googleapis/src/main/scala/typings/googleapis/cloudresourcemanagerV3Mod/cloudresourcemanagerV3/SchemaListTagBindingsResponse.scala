package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTagBindingsResponse extends StObject {
  
  /**
    * Pagination token. If the result set is too large to fit in a single response, this token is returned. It encodes the position of the current result cursor. Feeding this value into a new list request with the `page_token` parameter gives the next page of the results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set. Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A possibly paginated list of TagBindings for the specified resource.
    */
  var tagBindings: js.UndefOr[js.Array[SchemaTagBinding]] = js.undefined
}
object SchemaListTagBindingsResponse {
  
  inline def apply(): SchemaListTagBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTagBindingsResponse]
  }
  
  extension [Self <: SchemaListTagBindingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTagBindings(value: js.Array[SchemaTagBinding]): Self = StObject.set(x, "tagBindings", value.asInstanceOf[js.Any])
    
    inline def setTagBindingsUndefined: Self = StObject.set(x, "tagBindings", js.undefined)
    
    inline def setTagBindingsVarargs(value: SchemaTagBinding*): Self = StObject.set(x, "tagBindings", js.Array(value*))
  }
}
