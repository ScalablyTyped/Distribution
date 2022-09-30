package typings.gatsbyCli.typesMod

import typings.gatsbyCli.anon.StartTime
import typings.gatsbyCli.constantsMod.Actions.PendingActivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPendingActivity
  extends StObject
     with ActionsUnion {
  
  var payload: StartTime
  
  var `type`: PendingActivity
}
object IPendingActivity {
  
  inline def apply(payload: StartTime, `type`: PendingActivity): IPendingActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPendingActivity]
  }
  
  extension [Self <: IPendingActivity](x: Self) {
    
    inline def setPayload(value: StartTime): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: PendingActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
