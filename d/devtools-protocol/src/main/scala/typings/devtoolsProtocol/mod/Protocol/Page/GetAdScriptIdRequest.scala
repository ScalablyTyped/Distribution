package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdScriptIdRequest extends StObject {
  
  var frameId: FrameId
}
object GetAdScriptIdRequest {
  
  inline def apply(frameId: FrameId): GetAdScriptIdRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAdScriptIdRequest]
  }
  
  extension [Self <: GetAdScriptIdRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
