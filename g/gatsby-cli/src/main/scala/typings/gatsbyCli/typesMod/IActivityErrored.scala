package typings.gatsbyCli.typesMod

import typings.gatsbyCli.anon.IdString
import typings.gatsbyCli.constantsMod.Actions.ActivityErrored
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActivityErrored
  extends StObject
     with ActionsUnion {
  
  var payload: IdString
  
  var `type`: ActivityErrored
}
object IActivityErrored {
  
  inline def apply(payload: IdString, `type`: ActivityErrored): IActivityErrored = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActivityErrored]
  }
  
  extension [Self <: IActivityErrored](x: Self) {
    
    inline def setPayload(value: IdString): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: ActivityErrored): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
