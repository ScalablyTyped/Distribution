package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a WriteResponse. */
trait IWriteResponse extends StObject {
  
  /** WriteResponse commitTime */
  var commitTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** WriteResponse streamId */
  var streamId: js.UndefOr[String | Null] = js.undefined
  
  /** WriteResponse streamToken */
  var streamToken: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** WriteResponse writeResults */
  var writeResults: js.UndefOr[js.Array[IWriteResult] | Null] = js.undefined
}
object IWriteResponse {
  
  inline def apply(): IWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWriteResponse] (val x: Self) extends AnyVal {
    
    inline def setCommitTime(value: ITimestamp): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setCommitTimeNull: Self = StObject.set(x, "commitTime", null)
    
    inline def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdNull: Self = StObject.set(x, "streamId", null)
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setStreamToken(value: js.typedarray.Uint8Array): Self = StObject.set(x, "streamToken", value.asInstanceOf[js.Any])
    
    inline def setStreamTokenNull: Self = StObject.set(x, "streamToken", null)
    
    inline def setStreamTokenUndefined: Self = StObject.set(x, "streamToken", js.undefined)
    
    inline def setWriteResults(value: js.Array[IWriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    inline def setWriteResultsNull: Self = StObject.set(x, "writeResults", null)
    
    inline def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    inline def setWriteResultsVarargs(value: IWriteResult*): Self = StObject.set(x, "writeResults", js.Array(value*))
  }
}
