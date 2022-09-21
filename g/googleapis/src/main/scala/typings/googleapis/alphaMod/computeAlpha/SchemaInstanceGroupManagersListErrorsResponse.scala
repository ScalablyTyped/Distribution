package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersListErrorsResponse extends StObject {
  
  /**
    * [Output Only] The list of errors of the managed instance group.
    */
  var items: js.UndefOr[js.Array[SchemaInstanceManagedByIgmError]] = js.undefined
  
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceGroupManagersListErrorsResponse {
  
  inline def apply(): SchemaInstanceGroupManagersListErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersListErrorsResponse]
  }
  
  extension [Self <: SchemaInstanceGroupManagersListErrorsResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaInstanceManagedByIgmError]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaInstanceManagedByIgmError*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
