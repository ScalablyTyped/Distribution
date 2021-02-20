package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestNodeRequest extends StObject {
  
  /**
    * JavaScript object id to convert into node.
    */
  var objectId: RemoteObjectId = js.native
}
object RequestNodeRequest {
  
  @scala.inline
  def apply(objectId: RemoteObjectId): RequestNodeRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestNodeRequest]
  }
  
  @scala.inline
  implicit class RequestNodeRequestMutableBuilder[Self <: RequestNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
