package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginTrialsRequest extends StObject {
  
  var frameId: FrameId
}
object GetOriginTrialsRequest {
  
  inline def apply(frameId: FrameId): GetOriginTrialsRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOriginTrialsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOriginTrialsRequest] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
