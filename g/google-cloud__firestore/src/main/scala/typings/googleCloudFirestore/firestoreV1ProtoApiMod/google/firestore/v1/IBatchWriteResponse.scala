package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.rpc.IStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchWriteResponse. */
trait IBatchWriteResponse extends StObject {
  
  /** BatchWriteResponse status */
  var status: js.UndefOr[js.Array[IStatus] | Null] = js.undefined
  
  /** BatchWriteResponse writeResults */
  var writeResults: js.UndefOr[js.Array[IWriteResult] | Null] = js.undefined
}
object IBatchWriteResponse {
  
  inline def apply(): IBatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchWriteResponse]
  }
  
  extension [Self <: IBatchWriteResponse](x: Self) {
    
    inline def setStatus(value: js.Array[IStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: IStatus*): Self = StObject.set(x, "status", js.Array(value*))
    
    inline def setWriteResults(value: js.Array[IWriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    inline def setWriteResultsNull: Self = StObject.set(x, "writeResults", null)
    
    inline def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    inline def setWriteResultsVarargs(value: IWriteResult*): Self = StObject.set(x, "writeResults", js.Array(value*))
  }
}
