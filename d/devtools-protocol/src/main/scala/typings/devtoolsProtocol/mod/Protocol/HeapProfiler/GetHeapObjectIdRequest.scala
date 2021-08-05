package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHeapObjectIdRequest extends StObject {
  
  /**
    * Identifier of the object to get heap object id for.
    */
  var objectId: RemoteObjectId
}
object GetHeapObjectIdRequest {
  
  inline def apply(objectId: RemoteObjectId): GetHeapObjectIdRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdRequest]
  }
  
  extension [Self <: GetHeapObjectIdRequest](x: Self) {
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
