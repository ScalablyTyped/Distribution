package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFrameOwnerRequest extends StObject {
  
  var frameId: FrameId
}
object GetFrameOwnerRequest {
  
  inline def apply(frameId: FrameId): GetFrameOwnerRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameOwnerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFrameOwnerRequest] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
