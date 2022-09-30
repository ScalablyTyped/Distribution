package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.longrunning.IOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListBackupOperationsResponse. */
trait IListBackupOperationsResponse extends StObject {
  
  /** ListBackupOperationsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListBackupOperationsResponse operations */
  var operations: js.UndefOr[js.Array[IOperation] | Null] = js.undefined
}
object IListBackupOperationsResponse {
  
  inline def apply(): IListBackupOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListBackupOperationsResponse]
  }
  
  extension [Self <: IListBackupOperationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOperations(value: js.Array[IOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: IOperation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
