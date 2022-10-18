package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.global
import typings.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message
  extends StObject
     with Warning {
  
  var message: String
  
  var ruleId: String
  
  var `type`: global
}
object Message {
  
  inline def apply(message: String, ruleId: String): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("global")
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: global): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
