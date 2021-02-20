package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.attr
import typings.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attr extends Warning {
  
  var attr: String = js.native
  
  var message: String = js.native
  
  var node: typings.std.Element = js.native
  
  var ruleId: String = js.native
  
  var `type`: attr = js.native
}
object Attr {
  
  @scala.inline
  def apply(attr: String, message: String, node: typings.std.Element, ruleId: String, `type`: attr): Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
  
  @scala.inline
  implicit class AttrMutableBuilder[Self <: Attr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: typings.std.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: attr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
