package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListIndexesResponse. */
trait IListIndexesResponse extends StObject {
  
  /** ListIndexesResponse indexes */
  var indexes: js.UndefOr[js.Array[IIndex] | Null] = js.undefined
  
  /** ListIndexesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListIndexesResponse {
  
  inline def apply(): IListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListIndexesResponse]
  }
  
  extension [Self <: IListIndexesResponse](x: Self) {
    
    inline def setIndexes(value: js.Array[IIndex]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesNull: Self = StObject.set(x, "indexes", null)
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: IIndex*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
