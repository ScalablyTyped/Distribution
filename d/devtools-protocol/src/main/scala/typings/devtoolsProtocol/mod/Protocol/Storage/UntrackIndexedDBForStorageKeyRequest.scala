package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntrackIndexedDBForStorageKeyRequest extends StObject {
  
  /**
    * Storage key.
    */
  var storageKey: String
}
object UntrackIndexedDBForStorageKeyRequest {
  
  inline def apply(storageKey: String): UntrackIndexedDBForStorageKeyRequest = {
    val __obj = js.Dynamic.literal(storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntrackIndexedDBForStorageKeyRequest]
  }
  
  extension [Self <: UntrackIndexedDBForStorageKeyRequest](x: Self) {
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
