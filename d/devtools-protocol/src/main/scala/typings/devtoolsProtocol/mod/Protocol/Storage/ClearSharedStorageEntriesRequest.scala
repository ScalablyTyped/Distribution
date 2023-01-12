package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearSharedStorageEntriesRequest extends StObject {
  
  var ownerOrigin: String
}
object ClearSharedStorageEntriesRequest {
  
  inline def apply(ownerOrigin: String): ClearSharedStorageEntriesRequest = {
    val __obj = js.Dynamic.literal(ownerOrigin = ownerOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSharedStorageEntriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearSharedStorageEntriesRequest] (val x: Self) extends AnyVal {
    
    inline def setOwnerOrigin(value: String): Self = StObject.set(x, "ownerOrigin", value.asInstanceOf[js.Any])
  }
}
