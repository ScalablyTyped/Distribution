package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateTargetRequest extends StObject {
  
  var targetId: TargetID
}
object ActivateTargetRequest {
  
  inline def apply(targetId: TargetID): ActivateTargetRequest = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateTargetRequest]
  }
  
  extension [Self <: ActivateTargetRequest](x: Self) {
    
    inline def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
