package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListOperationsRequest. */
trait IListOperationsRequest extends StObject {
  
  /** ListOperationsRequest filter */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /** ListOperationsRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** ListOperationsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListOperationsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
}
object IListOperationsRequest {
  
  inline def apply(): IListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListOperationsRequest]
  }
  
  extension [Self <: IListOperationsRequest](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
