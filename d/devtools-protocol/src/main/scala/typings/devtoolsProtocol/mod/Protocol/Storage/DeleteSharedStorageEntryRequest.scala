package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSharedStorageEntryRequest extends StObject {
  
  var key: String
  
  var ownerOrigin: String
}
object DeleteSharedStorageEntryRequest {
  
  inline def apply(key: String, ownerOrigin: String): DeleteSharedStorageEntryRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], ownerOrigin = ownerOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSharedStorageEntryRequest]
  }
  
  extension [Self <: DeleteSharedStorageEntryRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOwnerOrigin(value: String): Self = StObject.set(x, "ownerOrigin", value.asInstanceOf[js.Any])
  }
}
