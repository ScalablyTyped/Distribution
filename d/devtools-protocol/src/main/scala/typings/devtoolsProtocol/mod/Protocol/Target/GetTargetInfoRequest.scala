package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetInfoRequest extends StObject {
  
  var targetId: js.UndefOr[TargetID] = js.undefined
}
object GetTargetInfoRequest {
  
  inline def apply(): GetTargetInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTargetInfoRequest]
  }
  
  extension [Self <: GetTargetInfoRequest](x: Self) {
    
    inline def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
