package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionsPolicyStateRequest extends StObject {
  
  var frameId: FrameId
}
object GetPermissionsPolicyStateRequest {
  
  inline def apply(frameId: FrameId): GetPermissionsPolicyStateRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionsPolicyStateRequest]
  }
  
  extension [Self <: GetPermissionsPolicyStateRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
