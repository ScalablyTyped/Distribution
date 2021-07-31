package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action[Payload] extends StObject {
  
  var payload: Payload
  
  var `type`: Identifier
}
object Action {
  
  @scala.inline
  def apply[Payload](payload: Payload, `type`: Identifier): Action[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[Payload]]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action[?], Payload] (val x: Self & Action[Payload]) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
