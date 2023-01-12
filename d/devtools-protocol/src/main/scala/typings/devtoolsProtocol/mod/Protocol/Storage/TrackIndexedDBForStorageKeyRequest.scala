package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackIndexedDBForStorageKeyRequest extends StObject {
  
  /**
    * Storage key.
    */
  var storageKey: String
}
object TrackIndexedDBForStorageKeyRequest {
  
  inline def apply(storageKey: String): TrackIndexedDBForStorageKeyRequest = {
    val __obj = js.Dynamic.literal(storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackIndexedDBForStorageKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackIndexedDBForStorageKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
