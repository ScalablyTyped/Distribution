package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListFieldsRequest. */
trait IListFieldsRequest extends StObject {
  
  /** ListFieldsRequest filter */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /** ListFieldsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListFieldsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListFieldsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IListFieldsRequest {
  
  inline def apply(): IListFieldsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListFieldsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IListFieldsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
