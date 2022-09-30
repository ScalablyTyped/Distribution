package typings.gatsbyCli.typesMod

import typings.gatsbyCli.constantsMod.Actions.StartActivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStartActivity
  extends StObject
     with ActionsUnion {
  
  var payload: IActivity
  
  var `type`: StartActivity
}
object IStartActivity {
  
  inline def apply(payload: IActivity, `type`: StartActivity): IStartActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStartActivity]
  }
  
  extension [Self <: IStartActivity](x: Self) {
    
    inline def setPayload(value: IActivity): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: StartActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
