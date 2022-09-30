package typings.gatsbyCli.typesMod

import typings.gatsbyCli.constantsMod.Actions.SetStatus
import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.gatsbyCliStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetStatus
  extends StObject
     with ActionsUnion {
  
  var payload: ActivityStatuses | _empty
  
  var `type`: SetStatus
}
object ISetStatus {
  
  inline def apply(payload: ActivityStatuses | _empty, `type`: SetStatus): ISetStatus = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetStatus]
  }
  
  extension [Self <: ISetStatus](x: Self) {
    
    inline def setPayload(value: ActivityStatuses | _empty): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: SetStatus): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
