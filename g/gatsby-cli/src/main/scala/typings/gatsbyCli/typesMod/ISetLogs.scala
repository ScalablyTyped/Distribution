package typings.gatsbyCli.typesMod

import typings.gatsbyCli.constantsMod.Actions.SetLogs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetLogs
  extends StObject
     with ActionsUnion {
  
  var payload: IGatsbyCLIState
  
  var `type`: SetLogs
}
object ISetLogs {
  
  inline def apply(payload: IGatsbyCLIState, `type`: SetLogs): ISetLogs = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetLogs]
  }
  
  extension [Self <: ISetLogs](x: Self) {
    
    inline def setPayload(value: IGatsbyCLIState): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: SetLogs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
