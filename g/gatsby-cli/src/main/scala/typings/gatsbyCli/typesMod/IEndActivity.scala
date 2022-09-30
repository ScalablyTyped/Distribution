package typings.gatsbyCli.typesMod

import typings.gatsbyCli.anon.Type
import typings.gatsbyCli.constantsMod.Actions.EndActivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEndActivity
  extends StObject
     with ActionsUnion {
  
  var payload: Type
  
  var `type`: EndActivity
}
object IEndActivity {
  
  inline def apply(payload: Type, `type`: EndActivity): IEndActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEndActivity]
  }
  
  extension [Self <: IEndActivity](x: Self) {
    
    inline def setPayload(value: Type): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: EndActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
