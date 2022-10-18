package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action[Payload] extends StObject {
  
  var payload: Payload
  
  var `type`: Identifier
}
object Action {
  
  inline def apply[Payload](payload: Payload, `type`: Identifier): Action[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[Payload]]
  }
  
  extension [Self <: Action[?], Payload](x: Self & Action[Payload]) {
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
