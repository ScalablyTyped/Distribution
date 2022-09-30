package typings.gatsbyCli.typesMod

import typings.gatsbyCli.anon.Duration
import typings.gatsbyCli.constantsMod.Actions.CancelActivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICancelActivity
  extends StObject
     with ActionsUnion {
  
  var payload: Duration
  
  var `type`: CancelActivity
}
object ICancelActivity {
  
  inline def apply(payload: Duration, `type`: CancelActivity): ICancelActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICancelActivity]
  }
  
  extension [Self <: ICancelActivity](x: Self) {
    
    inline def setPayload(value: Duration): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: CancelActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
