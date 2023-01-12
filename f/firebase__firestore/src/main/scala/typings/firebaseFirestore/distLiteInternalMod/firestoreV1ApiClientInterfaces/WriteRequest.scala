package typings.firebaseFirestore.distLiteInternalMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distLiteInternalMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteRequest extends StObject {
  
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  
  var streamId: js.UndefOr[String] = js.undefined
  
  var streamToken: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}
object WriteRequest {
  
  inline def apply(): WriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteRequest] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: ApiClientObjectMap[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setStreamToken(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "streamToken", value.asInstanceOf[js.Any])
    
    inline def setStreamTokenUndefined: Self = StObject.set(x, "streamToken", js.undefined)
    
    inline def setWrites(value: js.Array[Write]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    inline def setWritesVarargs(value: Write*): Self = StObject.set(x, "writes", js.Array(value*))
  }
}
