package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageKeyForFrameResponse extends StObject {
  
  var storageKey: SerializedStorageKey
}
object GetStorageKeyForFrameResponse {
  
  inline def apply(storageKey: SerializedStorageKey): GetStorageKeyForFrameResponse = {
    val __obj = js.Dynamic.literal(storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageKeyForFrameResponse]
  }
  
  extension [Self <: GetStorageKeyForFrameResponse](x: Self) {
    
    inline def setStorageKey(value: SerializedStorageKey): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
