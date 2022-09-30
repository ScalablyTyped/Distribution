package typings.gatsbyCli.typesMod

import typings.gatsbyCli.constantsMod.Actions.Log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreateLog
  extends StObject
     with ActionsUnion {
  
  var payload: ILog
  
  var `type`: Log
}
object ICreateLog {
  
  inline def apply(payload: ILog, `type`: Log): ICreateLog = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateLog]
  }
  
  extension [Self <: ICreateLog](x: Self) {
    
    inline def setPayload(value: ILog): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: Log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
