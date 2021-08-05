package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.attr
import typings.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attr
  extends StObject
     with Warning {
  
  var attr: String
  
  var message: String
  
  var node: typings.std.Element
  
  var ruleId: String
  
  var `type`: attr
}
object Attr {
  
  inline def apply(attr: String, message: String, node: typings.std.Element, ruleId: String): Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attr")
    __obj.asInstanceOf[Attr]
  }
  
  extension [Self <: Attr](x: Self) {
    
    inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNode(value: typings.std.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: attr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
