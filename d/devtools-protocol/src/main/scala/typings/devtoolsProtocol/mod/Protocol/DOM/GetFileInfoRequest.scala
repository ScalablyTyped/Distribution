package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileInfoRequest extends StObject {
  
  /**
    * JavaScript object id of the node wrapper.
    */
  var objectId: RemoteObjectId = js.native
}
object GetFileInfoRequest {
  
  @scala.inline
  def apply(objectId: RemoteObjectId): GetFileInfoRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoRequest]
  }
  
  @scala.inline
  implicit class GetFileInfoRequestMutableBuilder[Self <: GetFileInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
