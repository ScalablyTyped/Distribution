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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStorageKeyForFrameResponse] (val x: Self) extends AnyVal {
    
    inline def setStorageKey(value: SerializedStorageKey): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
