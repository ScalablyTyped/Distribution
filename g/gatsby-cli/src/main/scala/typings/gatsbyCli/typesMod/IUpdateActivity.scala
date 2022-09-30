package typings.gatsbyCli.typesMod

import typings.gatsbyCli.anon.Uuid
import typings.gatsbyCli.constantsMod.Actions.UpdateActivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdateActivity
  extends StObject
     with ActionsUnion {
  
  var payload: Uuid
  
  var `type`: UpdateActivity
}
object IUpdateActivity {
  
  inline def apply(payload: Uuid, `type`: UpdateActivity): IUpdateActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateActivity]
  }
  
  extension [Self <: IUpdateActivity](x: Self) {
    
    inline def setPayload(value: Uuid): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: UpdateActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
