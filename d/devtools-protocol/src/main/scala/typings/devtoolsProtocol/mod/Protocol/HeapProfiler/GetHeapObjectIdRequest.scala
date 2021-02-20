package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHeapObjectIdRequest extends StObject {
  
  /**
    * Identifier of the object to get heap object id for.
    */
  var objectId: RemoteObjectId = js.native
}
object GetHeapObjectIdRequest {
  
  @scala.inline
  def apply(objectId: RemoteObjectId): GetHeapObjectIdRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdRequest]
  }
  
  @scala.inline
  implicit class GetHeapObjectIdRequestMutableBuilder[Self <: GetHeapObjectIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
