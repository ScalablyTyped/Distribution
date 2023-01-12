package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteResponse extends StObject {
  
  var commitTime: js.UndefOr[Timestamp] = js.undefined
  
  var streamId: js.UndefOr[String] = js.undefined
  
  var streamToken: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.undefined
}
object WriteResponse {
  
  inline def apply(): WriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteResponse] (val x: Self) extends AnyVal {
    
    inline def setCommitTime(value: Timestamp): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setStreamToken(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "streamToken", value.asInstanceOf[js.Any])
    
    inline def setStreamTokenUndefined: Self = StObject.set(x, "streamToken", js.undefined)
    
    inline def setWriteResults(value: js.Array[WriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    inline def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    inline def setWriteResultsVarargs(value: WriteResult*): Self = StObject.set(x, "writeResults", js.Array(value*))
  }
}
