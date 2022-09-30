package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListOperationsResponse. */
trait IListOperationsResponse extends StObject {
  
  /** ListOperationsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListOperationsResponse operations */
  var operations: js.UndefOr[js.Array[IOperation] | Null] = js.undefined
}
object IListOperationsResponse {
  
  inline def apply(): IListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListOperationsResponse]
  }
  
  extension [Self <: IListOperationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOperations(value: js.Array[IOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: IOperation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
